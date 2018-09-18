package com.greenfox.bankofsimba.model;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

  @GetMapping("/bank")
  public String showBankAccount(Model model) {
    Bank bank = new Bank(Arrays.asList(
        new BankAccount("Simba", 2000., "Lion"),
        new BankAccount("Timon", 1000., "Meerkat"),
        new BankAccount("Pumba", 1000., "Warthog"),
        new BankAccount("Ed", 500., "Hyena")));

    model.addAttribute("bankAccounts", bank.getBankAccounts());

    return "bank";
  }
}
