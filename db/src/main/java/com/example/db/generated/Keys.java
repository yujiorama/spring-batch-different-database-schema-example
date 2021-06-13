/*
 * This file is generated by jOOQ.
 */
package com.example.db.generated;


import com.example.db.generated.tables.Todo;
import com.example.db.generated.tables.TodoComment;
import com.example.db.generated.tables.records.TodoCommentRecord;
import com.example.db.generated.tables.records.TodoRecord;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import javax.annotation.processing.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * demo.
 */
@Generated(
        value = {
                "https://www.jooq.org",
                "jOOQ version:3.14.11"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TodoRecord> TODO_PKC = Internal.createUniqueKey(Todo.TODO, DSL.name("todo_pkc"), new TableField[]{Todo.TODO.ID}, true);
    public static final UniqueKey<TodoCommentRecord> TODO_COMMENT_PKC = Internal.createUniqueKey(TodoComment.TODO_COMMENT, DSL.name("todo_comment_pkc"), new TableField[]{TodoComment.TODO_COMMENT.ID}, true);
}
