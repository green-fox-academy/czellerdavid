package com.greenfox.bookingsystem.Controllers;

import com.greenfox.bookingsystem.BookingDTO.Bookings;
import com.greenfox.bookingsystem.Sercives.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {


  BookingService bookingService;

  @Autowired
  public MainRestController(BookingService bookingService) {
    this.bookingService = bookingService;
  }

  @GetMapping("/reservations")
  public Bookings allReservation() {

    Bookings bookings = new Bookings();

    bookings.allBooking = bookingService.getAllBookings();

    return bookings;
  }

  @GetMapping("/top-movies")
  public Object topMovies() {


    Object topFive = bookingService.topFive();

    return topFive;

  }
}
