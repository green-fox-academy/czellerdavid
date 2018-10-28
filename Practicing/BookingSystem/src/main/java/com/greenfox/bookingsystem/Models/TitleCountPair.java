package com.greenfox.bookingsystem.Models;

public class TitleCountPair {

  String movie;
  int count;

  public TitleCountPair() {
  }

  public TitleCountPair(String movie, int count) {
    this.movie = movie;
    this.count = count;
  }

  public String getMovie() {
    return movie;
  }

  public void setMovie(String movie) {
    this.movie = movie;
  }

  public long getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
