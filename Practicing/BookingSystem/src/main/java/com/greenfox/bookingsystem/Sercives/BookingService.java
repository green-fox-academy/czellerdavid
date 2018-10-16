package com.greenfox.bookingsystem.Sercives;

import com.greenfox.bookingsystem.Models.Booking;
import com.greenfox.bookingsystem.Models.TitleCountPair;
import com.greenfox.bookingsystem.Repositories.BookingRepository;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {


  BookingRepository bookingRepository;

  @Autowired
  public BookingService(BookingRepository bookingRepository) {
    this.bookingRepository = bookingRepository;
  }

  public List<Booking> getAllBookings() {

    return bookingRepository.findAll();

  }

  public void createBooking(Booking booking) {

    if (booking.getGlasses() == true) {
      booking.setPrice(booking.getPrice() + 300);
    }
    bookingRepository.save(booking);

  }

  public Booking bookingById(Long id) {

    return bookingRepository.findById(id).orElse(null);

  }

  public List<TitleCountPair> topFive() {

    return bookingRepository.mostPopularMovies();

  }
}
