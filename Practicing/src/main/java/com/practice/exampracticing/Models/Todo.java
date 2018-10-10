package com.practice.exampracticing.Models;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String action;
  boolean done = false;
  boolean urgent = false;

  public Todo() {
  }

  public Todo(String action, boolean done, boolean urgent) {
    this.action = action;
    this.done = done;
    this.urgent = urgent;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }
}
