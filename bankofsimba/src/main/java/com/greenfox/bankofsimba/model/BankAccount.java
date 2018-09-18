package com.greenfox.bankofsimba.model;

import java.util.List;

public class BankAccount {

  String name;
  Double balance;
  String animalType;



  public BankAccount(String name, Double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;

  }

  public String getName() {
    return name;
  }

  public Double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
