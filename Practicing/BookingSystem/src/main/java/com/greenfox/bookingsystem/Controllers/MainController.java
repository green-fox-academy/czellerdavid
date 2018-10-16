package com.greenfox.bookingsystem.Controllers;

import com.greenfox.bookingsystem.Models.Booking;
import com.greenfox.bookingsystem.Sercives.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  BookingService bookingService;

  @Autowired
  public MainController(BookingService bookingService) {
    this.bookingService = bookingService;
  }

  @GetMapping("/")
  public String mainPage() {

    return "mainpage";
  }

  @GetMapping("/save")
  public String reservation(){

    return "reservation";
  }

  @PostMapping("/save")
  public String createBooking(Booking booking){

    bookingService.createBooking(booking);

    return "reservation";

  }

  @GetMapping("/reservation/{id}")
  public String getReservation(Model model, @PathVariable (value = "id") Long id){

    model.addAttribute("booking", bookingService.bookingById(id));

    return "reservation";
  }
}
