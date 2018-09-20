package com.printer.printer;


import org.springframework.stereotype.Service;

@Service
public class Color implements MyColor{

  @Override
  public void printColor(String color) {
    System.out.println("My Color is " + color);
  }
}
