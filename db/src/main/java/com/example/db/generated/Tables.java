/*
 * This file is generated by jOOQ.
 */
package com.example.db.generated;


import com.example.db.generated.tables.Todo;
import com.example.db.generated.tables.TodoComment;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in demo.
 */
@Generated(
        value = {
                "https://www.jooq.org",
                "jOOQ version:3.14.11"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Tables {

    /**
     * The table <code>demo.todo</code>.
     */
    public static final Todo TODO = Todo.TODO;

    /**
     * The table <code>demo.todo_comment</code>.
     */
    public static final TodoComment TODO_COMMENT = TodoComment.TODO_COMMENT;
}
