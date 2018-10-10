package com.bankofsimba.bankofsimba.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String name;
  Long balance;
  String anmimalType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BankAccount() {
  }

  public BankAccount(String name, Long balance, String anmimalType) {
    this.name = name;
    this.balance = balance;
    this.anmimalType = anmimalType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public String getAnmimalType() {
    return anmimalType;
  }

  public void setAnmimalType(String anmimalType) {
    this.anmimalType = anmimalType;
  }
}
