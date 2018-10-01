package com.davidczeller.rest.model;

public class DoublingModel {

  private int received;
  private int result;

  public DoublingModel() {
  }

  public DoublingModel(int received) {
    this.received = received;
    result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
