package com.davidczeller.rest.model;

public class AppendA {

  private String appended;

  public AppendA() {
  }

  public AppendA(String appended) {
    this.appended = appended;
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

  public void set_appendedA(String appendable){
    this.appended = appendable + "a";
  }
}
