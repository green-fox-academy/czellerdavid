package com.davidczeller.rest.model;

import java.util.List;

public class ArrayHandler {

 private String what;
  private List<Integer> numbers;

  public ArrayHandler() {
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }
}
