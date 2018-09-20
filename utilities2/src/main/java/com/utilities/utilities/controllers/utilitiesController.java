package com.utilities.utilities.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class utilitiesController {

  @GetMapping("/useful")
  public String page(){
    return "utilities";
  }

  @GetMapping("/useful/randomColor")
  public String randomColor(){

    return "randomColor";
  }
}
