package com.utilities.utilities.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilitiesService {
  ArrayList<String> colors;
  Random random;

  public UtilitiesService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }
}
