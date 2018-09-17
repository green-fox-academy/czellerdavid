package com.greenfox.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private long id;
  private String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public long getId() {
    return id;
  }
}

