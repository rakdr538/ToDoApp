package com.assaabloy.todoapp.repository;

import com.assaabloy.todoapp.model.entities.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.validation.annotation.Validated;

@Validated
@RepositoryRestResource(itemResourceRel = "todoItem", path="todos")
public interface TodoRepository extends JpaRepository<ToDoItem,Long> {}