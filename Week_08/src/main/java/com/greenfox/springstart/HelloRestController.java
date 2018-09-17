package com.greenfox.springstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

  @RequestMapping("/greeting")
  public static Greeting greeting(){
    Greeting greeting = new Greeting(1, "Lacika");
    return greeting;

  }

}
