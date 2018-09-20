package com.printer.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {
  Printer printer;
  Color color;


  @Autowired
  public PrinterApplication(Printer printer, Color color) {
    this.printer = printer;
    this.color = color;

  }

  public static void main(String[] args) {

    SpringApplication.run(PrinterApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello bitch");
    color.printColor("blue");
  }
}