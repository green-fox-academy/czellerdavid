package com.greenfox.bankofsimba.model;



public class BankAccount {


  long id;
  boolean king;
  String name;
  Double balance;
  String animalType;


  public BankAccount(long id, String name, Double balance, String animalType, boolean king) {
    this.id = id;
    this.king = king;
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;

  }
public void raise(){
    if(king){
      balance += 100;
    }else {
      balance += 10;
    }
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

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }
}
