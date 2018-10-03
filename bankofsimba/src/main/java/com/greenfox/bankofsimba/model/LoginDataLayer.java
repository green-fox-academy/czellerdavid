package com.greenfox.bankofsimba.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LoginDataLayer {


  List<User> users;
  // HashMap<String, String> users = new HashMap<String, String>();

  public LoginDataLayer() {

    users = new ArrayList<>();
    users.add(new User("admin", "admin"));

  }

  public void put(User user) {

    users.add(user);

  }

  public List<User> getUsers() {
    return users;

  }
}
