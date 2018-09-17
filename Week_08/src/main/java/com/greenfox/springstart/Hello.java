package com.greenfox.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
  @RequestMapping(value="/hello")
  @ResponseBody
  public static String hello(){
    return "Szeva Laci!";
  }
}
