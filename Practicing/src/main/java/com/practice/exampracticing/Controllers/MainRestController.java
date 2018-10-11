package com.practice.exampracticing.Controllers;

import com.practice.exampracticing.Models.Todo;
import com.practice.exampracticing.Models.TodoJSON;
import com.practice.exampracticing.Models.UrgentTodos;
import com.practice.exampracticing.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  TodoService todoService;

  @Autowired
  public MainRestController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/urgent")
  public UrgentTodos urgent(){

    UrgentTodos urgentTodos = new UrgentTodos();

    urgentTodos.urgents = todoService.getUrgents();


    return urgentTodos;
  }

  @PostMapping("/")
  public Object readJSON(@RequestBody(required =false) TodoJSON todoJSON){

  Todo todo = new Todo();

  todo.setId(todoJSON.getId());
  todo.setAction(todoJSON.getAction());
  todo.setDone(todoJSON.isDone());
  todo.setUrgent(todoJSON.isUrgent());

  todoService.save(todo);

    return todo;
  }
}
