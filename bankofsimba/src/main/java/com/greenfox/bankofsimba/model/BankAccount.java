package com.greenfox.bankofsimba.model;


public class BankAccount {


  long id;
  boolean king;
  String name;
  Double balance;
  String animalType;
  String username;
  String password;


  //accounts
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public void setAnimalType(String animalType) {
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

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }


  //login
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public BankAccount() {
  }

  public BankAccount(long id, String name, Double balance, String animalType, boolean king) {
    this.id = id;
    this.king = king;
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public BankAccount(String username, String password) {
    this.username = username;
    this.password = password;
  }


  public void raise() {
    if (king) {
      balance += 100;
    } else {
      balance += 10;
    }
  }
}