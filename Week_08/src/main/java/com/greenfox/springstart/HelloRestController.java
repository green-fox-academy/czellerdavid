package com.greenfox.springstart;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {


  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public static Greeting greeting(@RequestParam(value = "name") String name){

    Greeting greeting = new Greeting(1, "Hello, " + name);
    return greeting;

  }

}
///@RequestMapping(value="/pow", method=RequestMethod.GET)
//public int pow(@RequestParam(value="base") int base1, @RequestParam(value="ext") int ext1){
//    int pow = (int) Math.pow(base1, ext1);
//    return pow;
//    }