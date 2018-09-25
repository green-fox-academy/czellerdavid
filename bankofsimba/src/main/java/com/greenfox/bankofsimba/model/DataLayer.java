package com.greenfox.bankofsimba.model;

import java.util.Arrays;

public class DataLayer {

  private static DataLayer instance;

  public static final DataLayer getInstance() {

    if (instance == null) {
      instance = new DataLayer();
    }
    return instance;
  }

  Bank bank;

  public DataLayer() {
    bank = new Bank(Arrays.asList(
        new BankAccount(1, "Simba", 2000., "Lion", true),
        new BankAccount(2, "Timon", 1000., "Meerkat", false),
        new BankAccount(3, "Pumba", 1000., "Warthog", false),
        new BankAccount(4, "Ed", 500., "Hyena", false)));
  }

  public BankAccount getBankAccount(long id) {

    for (BankAccount account : bank.bankAccounts) {

      if(account.id == id){
        return account;
      }
    }
    return null;
  }
}
