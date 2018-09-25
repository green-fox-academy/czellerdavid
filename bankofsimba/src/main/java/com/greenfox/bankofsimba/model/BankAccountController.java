package com.greenfox.bankofsimba.model;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BankAccountController {
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

    Bank bank = DataLayer.getInstance().bank;
    model.addAttribute("bankAccounts", bank.getBankAccounts());

    return "bank";
  }

  @PostMapping("/bank")
  public String raiseMoney(@RequestParam(value = "id") long id) {

    DataLayer dataLayer = DataLayer.getInstance();
    BankAccount bankAccount = dataLayer.getBankAccount(id);
    bankAccount.raise();
    return "redirect:/bank";
  }

  @GetMapping("/login")
  public String login(Model model) {

    return "login";
  }
}
