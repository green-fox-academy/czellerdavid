package com.greenfox.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong id;

  public HelloWebController() {
    this.id = new AtomicLong(1);
  }

  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " Dave");
    model.addAttribute("id", id.getAndIncrement());
    return "greeting";
  }
}
