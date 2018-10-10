package com.bankofsimba.bankofsimba.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/show")
  public String show(){

    return "show";
  }
}
