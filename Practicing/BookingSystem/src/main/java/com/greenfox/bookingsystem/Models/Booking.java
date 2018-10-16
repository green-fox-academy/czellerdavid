package com.greenfox.bookingsystem.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String name;
  String phoneNumber;
  String movie;
  Boolean glasses = false;
  int price = 1500;

  public Booking() {
  }

  public Booking(String name, String phoneNumber, String movie, Boolean glasses) {
    this.glasses = glasses;
    this.price = price;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.movie = movie;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() { return phoneNumber; }

  public void setPhoneNumber(String  phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getMovie() {
    return movie;
  }

  public void setMovie(String movie) {
    this.movie = movie;
  }

  public Boolean getGlasses() {
    return glasses;
  }

  public void setGlasses(Boolean glasses) {
    this.glasses = glasses;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
