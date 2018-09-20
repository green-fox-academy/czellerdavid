package com.tamagotchi.tamagotchi;

import com.sun.corba.se.pept.transport.ContactInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String homePage(Model model, @RequestParam(value = "name", required = false) String name) {
  if(name == null || name == ""){
    return "redirect:/login";
  }
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/login")
  public String loginPage(Model model) {

    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam("name") String name) {
    if (name == null) {
      return "redirect:/login";
    }
    return "redirect:/?name=" + name;
  }


}
