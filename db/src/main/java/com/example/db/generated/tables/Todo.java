/*
 * This file is generated by jOOQ.
 */
package com.example.db.generated.tables;


import com.example.db.generated.Demo;
import com.example.db.generated.Indexes;
import com.example.db.generated.Keys;
import com.example.db.generated.tables.records.TodoRecord;
import org.jetbrains.annotations.NotNull;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "https://www.jooq.org",
                "jOOQ version:3.14.11"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Todo extends TableImpl<TodoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>demo.todo</code>
     */
    public static final Todo TODO = new Todo();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<TodoRecord> getRecordType() {
        return TodoRecord.class;
    }

    /**
     * The column <code>demo.todo.id</code>.
     */
    public final TableField<TodoRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>demo.todo.title</code>.
     */
    public final TableField<TodoRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>demo.todo.content</code>.
     */
    public final TableField<TodoRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>demo.todo.created_at</code>.
     */
    public final TableField<TodoRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>demo.todo.modified_at</code>.
     */
    public final TableField<TodoRecord, LocalDateTime> MODIFIED_AT = createField(DSL.name("modified_at"), SQLDataType.LOCALDATETIME(6), this, "");

    private Todo(Name alias, Table<TodoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Todo(Name alias, Table<TodoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>demo.todo</code> table reference
     */
    public Todo(String alias) {
        this(DSL.name(alias), TODO);
    }

    /**
     * Create an aliased <code>demo.todo</code> table reference
     */
    public Todo(Name alias) {
        this(alias, TODO);
    }

    /**
     * Create a <code>demo.todo</code> table reference
     */
    public Todo() {
        this(DSL.name("todo"), null);
    }

    public <O extends Record> Todo(Table<O> child, ForeignKey<O, TodoRecord> key) {
        super(child, key, TODO);
    }

    @Override
    @NotNull
    public Schema getSchema() {
        return Demo.DEMO;
    }

    @Override
    @NotNull
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TODO_PKI);
    }

    @Override
    @NotNull
    public UniqueKey<TodoRecord> getPrimaryKey() {
        return Keys.TODO_PKC;
    }

    @Override
    @NotNull
    public List<UniqueKey<TodoRecord>> getKeys() {
        return Arrays.<UniqueKey<TodoRecord>>asList(Keys.TODO_PKC);
    }

    @Override
    @NotNull
    public Todo as(String alias) {
        return new Todo(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Todo as(Name alias) {
        return new Todo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Todo rename(String name) {
        return new Todo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Todo rename(Name name) {
        return new Todo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Integer, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
