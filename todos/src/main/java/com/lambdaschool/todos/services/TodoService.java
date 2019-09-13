package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;


public interface TodoService {
    Todo update(Todo todo, long id);

}