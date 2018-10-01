package com.davidczeller.rest.Service;

import com.davidczeller.rest.model.DoUntil;
import org.springframework.stereotype.Service;

@Service
public class DoUntilService {


  public void factor(Integer until, DoUntil doUntil) {
    Integer result = until;
    for (int i = until - 1; i > 0; i--) {
      result *= i;
    }

    doUntil.setResult(result);
  }
  public void sum(Integer until, DoUntil doUntil) {
    Integer result = 0;
    for (int i = 0; i <= until; i++) {
      result += i;
    }

    doUntil.setResult(result);
  }
}
