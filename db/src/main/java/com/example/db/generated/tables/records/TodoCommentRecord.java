/*
 * This file is generated by jOOQ.
 */
package com.example.db.generated.tables.records;


import com.example.db.generated.tables.TodoComment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;
import java.beans.ConstructorProperties;
import java.time.LocalDateTime;


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
public class TodoCommentRecord extends UpdatableRecordImpl<TodoCommentRecord> implements Record5<Integer, Integer, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>demo.todo_comment.id</code>.
     */
    public TodoCommentRecord setId(@NotNull Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>demo.todo_comment.id</code>.
     */
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>demo.todo_comment.todo_id</code>.
     */
    public TodoCommentRecord setTodoId(@NotNull Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>demo.todo_comment.todo_id</code>.
     */
    @NotNull
    public Integer getTodoId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>demo.todo_comment.content</code>.
     */
    public TodoCommentRecord setContent(@Nullable String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>demo.todo_comment.content</code>.
     */
    @Nullable
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>demo.todo_comment.created_at</code>.
     */
    public TodoCommentRecord setCreatedAt(@Nullable LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>demo.todo_comment.created_at</code>.
     */
    @Nullable
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>demo.todo_comment.modified_at</code>.
     */
    public TodoCommentRecord setModifiedAt(@Nullable LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>demo.todo_comment.modified_at</code>.
     */
    @Nullable
    public LocalDateTime getModifiedAt() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Integer, Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<Integer, Integer, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Integer> field1() {
        return TodoComment.TODO_COMMENT.ID;
    }

    @Override
    @NotNull
    public Field<Integer> field2() {
        return TodoComment.TODO_COMMENT.TODO_ID;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return TodoComment.TODO_COMMENT.CONTENT;
    }

    @Override
    @NotNull
    public Field<LocalDateTime> field4() {
        return TodoComment.TODO_COMMENT.CREATED_AT;
    }

    @Override
    @NotNull
    public Field<LocalDateTime> field5() {
        return TodoComment.TODO_COMMENT.MODIFIED_AT;
    }

    @Override
    @NotNull
    public Integer component1() {
        return getId();
    }

    @Override
    @NotNull
    public Integer component2() {
        return getTodoId();
    }

    @Override
    @Nullable
    public String component3() {
        return getContent();
    }

    @Override
    @Nullable
    public LocalDateTime component4() {
        return getCreatedAt();
    }

    @Override
    @Nullable
    public LocalDateTime component5() {
        return getModifiedAt();
    }

    @Override
    @NotNull
    public Integer value1() {
        return getId();
    }

    @Override
    @NotNull
    public Integer value2() {
        return getTodoId();
    }

    @Override
    @Nullable
    public String value3() {
        return getContent();
    }

    @Override
    @Nullable
    public LocalDateTime value4() {
        return getCreatedAt();
    }

    @Override
    @Nullable
    public LocalDateTime value5() {
        return getModifiedAt();
    }

    @Override
    @NotNull
    public TodoCommentRecord value1(@NotNull Integer value) {
        setId(value);
        return this;
    }

    @Override
    @NotNull
    public TodoCommentRecord value2(@NotNull Integer value) {
        setTodoId(value);
        return this;
    }

    @Override
    @NotNull
    public TodoCommentRecord value3(@Nullable String value) {
        setContent(value);
        return this;
    }

    @Override
    @NotNull
    public TodoCommentRecord value4(@Nullable LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    @NotNull
    public TodoCommentRecord value5(@Nullable LocalDateTime value) {
        setModifiedAt(value);
        return this;
    }

    @Override
    @NotNull
    public TodoCommentRecord values(@NotNull Integer value1, @NotNull Integer value2, @Nullable String value3, @Nullable LocalDateTime value4, @Nullable LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TodoCommentRecord
     */
    public TodoCommentRecord() {
        super(TodoComment.TODO_COMMENT);
    }

    /**
     * Create a detached, initialised TodoCommentRecord
     */
    @ConstructorProperties({"id", "todoId", "content", "createdAt", "modifiedAt"})
    public TodoCommentRecord(@NotNull Integer id, @NotNull Integer todoId, @Nullable String content, @Nullable LocalDateTime createdAt, @Nullable LocalDateTime modifiedAt) {
        super(TodoComment.TODO_COMMENT);

        setId(id);
        setTodoId(todoId);
        setContent(content);
        setCreatedAt(createdAt);
        setModifiedAt(modifiedAt);
    }
}
