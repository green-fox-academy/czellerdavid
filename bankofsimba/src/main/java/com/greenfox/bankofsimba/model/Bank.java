package com.greenfox.bankofsimba.model;

import java.util.List;

public class Bank {

  public Bank(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }
  public Bank() {
  }

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  List<BankAccount> bankAccounts;



}
