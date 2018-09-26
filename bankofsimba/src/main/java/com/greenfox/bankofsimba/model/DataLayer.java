package com.greenfox.bankofsimba.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataLayer {

  List<BankAccount> bank;


  public DataLayer() {

       bank = new ArrayList<>();
       bank.add(new BankAccount(1, "Simba", 2000., "Lion", true));
       bank.add(new BankAccount(2, "Timon", 1000., "Meerkat", false));
       bank.add(new BankAccount(3, "Pumba", 1000., "Warthog", false));
       bank.add(new BankAccount(4, "Ed", 500., "Hyena", false));
  }

  public void add(BankAccount bankAccount){

    bank.add(bankAccount);

  }

  public List<BankAccount> getBankAccounts() {
    return bank;
  }

  public BankAccount getBankAccount(long id) {

    for (BankAccount account : bank) {

      if(account.id == id){
        return account;
      }
    }
    return null;
  }
}
