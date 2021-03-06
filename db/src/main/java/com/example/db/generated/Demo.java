/*
 * This file is generated by jOOQ.
 */
package com.example.db.generated;


import com.example.db.generated.tables.Todo;
import com.example.db.generated.tables.TodoComment;
import org.jetbrains.annotations.NotNull;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.processing.Generated;
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
public class Demo extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>demo</code>
     */
    public static final Demo DEMO = new Demo();

    /**
     * The table <code>demo.todo</code>.
     */
    public final Todo TODO = Todo.TODO;

    /**
     * The table <code>demo.todo_comment</code>.
     */
    public final TodoComment TODO_COMMENT = TodoComment.TODO_COMMENT;

    /**
     * No further instances allowed
     */
    private Demo() {
        super("demo", null);
    }


    @Override
    @NotNull
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    @NotNull
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
                Todo.TODO,
                TodoComment.TODO_COMMENT);
    }
}
