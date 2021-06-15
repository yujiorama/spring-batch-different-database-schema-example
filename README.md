# spring-batch-different-database-schema-example

## モチベーション

Spring Batchのジョブ実行管理テーブルを、アプリケーションの使用するデータベーススキーマとは別のデータベーススキーマに作成、管理したい

## 解決策

1. `org.springframework.boot.autoconfigure.jdbc.DataSourceInitializer` が構成する `DataSource`
   とは別に、データベーススキーマだけが異なる `DataSource` を構成する
    + 指定するデータベーススキーマは `org.springframework.boot.autoconfigure.jdbc.DataSourceInitializer` が作成する
2. 構成した `DataSource` で `org.springframework.batch.core.configuration.annotation.BatchConfigurer` を構成する

## 具体例

モジュールの構成。

* webapp
    + dbに依存
    + Spring Bootで構成したただのWebアプリ
* batch
    + dbに依存
    + Spring Bootで構成した、Spring Batchのジョブを実行するコンソールアプリ
* db
    + jOOQの自動生成コード置き場
    + Flywayのマイグレーションスクリプト置き場
    + `org.springframework.boot.autoconfigure.jdbc.DataSourceInitializer` の参照するSQLスクリプト置き場

batchを実行する様子。

1. RDBを起動（初期化スクリプトは実行しない）
    + 状態
        - `demo` スキーマ（存在しない）
        - `batchdemo` スキーマ（存在しない）
2. webappを起動
    + 処理
        - `org.springframework.boot.autoconfigure.jdbc.DataSourceInitializer` がdbのSQLスクリプトを実行
        - Flywayがマイグレーションを実行
            * `demo` スキーマを作成
            * dbのマイグレーションスクリプトを実行
    + 状態
        - `demo` スキーマ（存在する）
            * アプリケーションのテーブル（存在する）
        - `batchdemo` スキーマ（存在する）
3. batchを実行
    + 処理
        - `org.springframework.boot.autoconfigure.jdbc.DataSourceInitializer` がdbのSQLスクリプトを実行
            * `CREATE SCHEMA IF NOT EXISTS` なので何もせずに終わる
        - `org.springframework.boot.autoconfigure.batch.BatchDataSourceInitializer` がjarに組み込まれたSQLスクリプトを実行
        - Flywayがマイグレーションを実行しない
    + 状態
        - `demo` スキーマ（存在する）
            * アプリケーションのテーブル（存在する）
        - `batchdemo` スキーマ（存在する）
            * Spring Batchのジョブ実行管理テーブル（存在する）
