package com.example.db.todo;

import com.example.db.generated.Tables;
import org.jetbrains.annotations.NotNull;
import org.jooq.DSLContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TodoDAO {

    @SuppressWarnings("FieldMayBeFinal")
    private DSLContext dsl;

    public TodoDAO(@NotNull DSLContext dsl) {
        this.dsl = dsl;
    }

    public List<Todo> findAll() {

        return dsl.selectFrom(Tables.TODO).fetchStreamInto(Todo.class)
                .peek(e -> e.setTodoComments(fetchTodoComments(this.dsl, e.getId())))
                .collect(Collectors.toList());
    }

    public Optional<Todo> findOne(int id) {

        return dsl.selectFrom(Tables.TODO).where(Tables.TODO.ID.eq(id)).fetchStreamInto(Todo.class)
                .peek(e -> e.setTodoComments(fetchTodoComments(this.dsl, e.getId())))
                .findFirst();
    }

    @NotNull
    private List<TodoComment> fetchTodoComments(@NotNull final DSLContext dsl, final int todoId) {
        return dsl.selectFrom(Tables.TODO_COMMENT)
                .where(Tables.TODO_COMMENT.TODO_ID.eq(todoId))
                .fetchInto(TodoComment.class);
    }
}
