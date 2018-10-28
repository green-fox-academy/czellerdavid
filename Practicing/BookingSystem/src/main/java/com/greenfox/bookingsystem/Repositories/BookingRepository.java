package com.greenfox.bookingsystem.Repositories;


import com.greenfox.bookingsystem.Models.Booking;
import com.greenfox.bookingsystem.Models.MovieSummary;
import com.greenfox.bookingsystem.Models.TitleCountPair;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {

  List<Booking> findAll();


  @Query(value = "SELECT movie, COUNT(movie) AS 'count'" +
      "FROM booking " +
      "GROUP BY movie " +
      "ORDER BY COUNT(movie) " +
      "DESC LIMIT 5",
      nativeQuery = true)

  List<MovieSummary> mostPopularMovies();
}
