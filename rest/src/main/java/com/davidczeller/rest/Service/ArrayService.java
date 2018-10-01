package com.davidczeller.rest.Service;


import com.davidczeller.rest.model.Result;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArrayService {


  public Result sumNumbers(List<Integer> numbers) {
    Result result = new Result();
    int temp = 0;
    for (int i = 0; i < numbers.size(); i++) {
      temp += numbers.get(i);
    }
    result.setResult(temp);
    return result;
  }


  public Result multiplyNumbers(List<Integer> numbers) {
    Result result = new Result();
    int temp = 1;
    for (int i = 1; i < numbers.size(); i++) {
      temp *= numbers.get(i);
    }
    result.setResult(temp);
    return result;
  }


  public Result doubleNumbersInList(List<Integer> numbers) {
    Result result = new Result();
    List<Integer> doubledElements = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      doubledElements.add(numbers.get(i) * 2);
      result.setResult(doubledElements);
    }
    return result;
  }
}
