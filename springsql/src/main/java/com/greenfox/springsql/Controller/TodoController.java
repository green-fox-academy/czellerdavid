package com.greenfox.springsql.Controller;

import com.greenfox.springsql.Model.Todo;
import com.greenfox.springsql.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepo todoRepo;

  @Autowired
  public TodoController(TodoRepo todoRepo) {
    this.todoRepo = todoRepo;
  }



  @GetMapping(value = {"/", "list"})
  public String list(@RequestParam(value = "isActive", required = false) Boolean done, Model model) {

    if (done == null) {
      model.addAttribute("todos", todoRepo.findAll());
    }else {
      model.addAttribute("todos", todoRepo.findAllByDone(done));
    }
    
    return "todolist";

  }
}
