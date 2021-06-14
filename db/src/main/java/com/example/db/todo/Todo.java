package com.example.db.todo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Todo extends com.example.db.generated.tables.pojos.Todo {

    @Getter
    @Setter(AccessLevel.PACKAGE)
    private List<TodoComment> todoComments = new ArrayList<>();
}
