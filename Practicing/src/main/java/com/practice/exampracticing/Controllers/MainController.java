package com.practice.exampracticing.Controllers;

import com.practice.exampracticing.Models.Todo;
import com.practice.exampracticing.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {


  TodoService todoService;

  @Autowired
  public MainController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping({"/", ""})
  public String todos(Model model) {
    model.addAttribute("todos", todoService.getAllTodos());

    return "homepage";
  }

  @GetMapping("/add")
  public String add(Model model) {

    model.addAttribute("todo", new Todo());


    return "add";
  }

//  @PostMapping("/add")
//  public String add(@RequestParam(value = "action") String action,
//                    @RequestParam(value = "done", required = false) Boolean done,
//                    @RequestParam(value = "urgent", required = false) Boolean urgent) {
//
//    todoService.add(action, done, urgent);
//
//
//    return "redirect:/";
//  }

  @PostMapping("/add")
  public String add(@ModelAttribute Todo todo){

    todoService.save(todo);


    return "redirect:/";
  }


  @GetMapping("/edit/{id}")
  public String edit(Model model, @PathVariable(value = "id") Long id){

    model.addAttribute("todo", todoService.todoById(id));

    return "add";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable(value = "id") Long id){

    todoService.deleteById(id);

    return "redirect:/";
  }

//  @PostMapping("/delete/{id}")
//  public String delete(@ModelAttribute Todo todo, Long id){
//
//    todoService.deleteById(todo, id);
//
//    return "redirect:/";
//  }

//  @PostMapping("/edit")
//  public String edit(@PathVariable(value = "id") Long id,
//                     @RequestParam(value = "action") String action,
//                     @RequestParam(value = "done", required = false) Boolean done,
//                     @RequestParam(value = "urgent", required = false) Boolean urgent){
//
//    todoService.edit(editedTodo);
//
//    return "redirect:/";
//
//  }
}
