package com.dbbankofsimba.dbbankofsimba.Controllers;

import com.dbbankofsimba.dbbankofsimba.Services.BankaccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


  BankaccountService bankaccountService;

  @Autowired
  public MainController(BankaccountService bankaccountService) {
    this.bankaccountService = bankaccountService;
  }


  @GetMapping("/show")
  public String show(Model model){
    model.addAttribute("bank_account", bankaccountService.getAllAccount());
    return "show";
  }

  @PostMapping("/show")
  public String createAcc(@RequestParam(value = "name") String name,
                          @RequestParam(value = "balance") Long balance,
                          @RequestParam(value = "animaltype") String animalType){

    bankaccountService.createAcc(name, animalType, balance);


    return "redirect:/show";
  }
}
