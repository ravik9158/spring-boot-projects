package com.app.todo.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.todo.domain.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo, String> {

}
