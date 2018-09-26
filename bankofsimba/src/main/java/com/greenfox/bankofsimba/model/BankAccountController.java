package com.greenfox.bankofsimba.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BankAccountController  {

  @Autowired
  DataLayer dataLayer;
  LoginDataLayer loginDataLayer;
  User user;

  @GetMapping("/test")
  public String test(Model model) {

    return "test";

  }

  @GetMapping("/information")
  public String infoPage(Model model) {

    return "information";

  }

  @GetMapping("/websites")
  public String websitePage(Model model) {
    return "websites";
  }

  @GetMapping("/signup")
  public String createUser(Model model){
    model.addAttribute("newuser",new User());
    return "signup";
  }
  @PostMapping("/signup")
  public String createdUser(@ModelAttribute User user){
    loginDataLayer.put(user);
    return "redirect:/login";
  }

  @GetMapping("/createaccount")
    public String createPage(Model model){
    model.addAttribute("newaccount",new BankAccount());
    return "createaccount";
  }

  @PostMapping("/createaccount")
  public String addTodo(@ModelAttribute BankAccount bankAccount){
    dataLayer.add(bankAccount);
    return "redirect:/bank";
  }

  @GetMapping("/contact")
  public String contactPage(Model model) {
    return "contact";
  }

  @GetMapping("")
  public String homePage(Model model) {

    return "homepage";

  }

  @GetMapping("/bank")
  public String showBankAccount(Model model) {

    model.addAttribute("bankAccounts", dataLayer.getBankAccounts());

    return "bank";
  }

  @PostMapping("/bank")
  public String raiseMoney(@RequestParam(value = "id") long id) {

    BankAccount bankAccount = dataLayer.getBankAccount(id);
    bankAccount.raise();
    return "redirect:/bank";
  }

  @GetMapping("/login")
  public String login(Model model) {

    return "login";
  }
  @PostMapping("/login")
  public String userValidation(User user){
    if(user.user == "admin" && user.password == "admin"){
      return "redirect:/bank";
    }
    return "redirect:/contact";
  }

//  @PostMapping("/login")
//  public String loggedIn(@RequestParam ()){
//    if(UserValidation) {
//      return "redirect:/bank";
//    }
//    return "redirect:/signup";
// }


}
