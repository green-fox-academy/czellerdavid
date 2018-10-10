package com.practice.exampracticing.Controllers;


import com.practice.exampracticing.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  TodoService todoService;

  @Autowired
  public MainRestController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/urgent")
  public Object urgent(){

    return todoService.urgent;
  }
}
