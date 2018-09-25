package com.greenfox.springsql.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  boolean urgent;
  boolean done;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Todo(){

  }

  public Todo(String title) {
    this.title = title;
    this.done = false;
    this.urgent = false;
  }
  public Todo(String title, boolean done, boolean urgent) {
    this.title = title;
    this.done = done;
    this.urgent = urgent;
  }
}
