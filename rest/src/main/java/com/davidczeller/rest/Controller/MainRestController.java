package com.davidczeller.rest.Controller;

import com.davidczeller.rest.Service.DoUntilService;
import com.davidczeller.rest.model.*;
import com.davidczeller.rest.model.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController{

  private DoUntilService doUntilService;

  @Autowired
  public MainRestController(DoUntilService doUntilService) {
    this.doUntilService = doUntilService;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input){

    if(input == null){
      DoublingError error = new DoublingError();
      error.setError("Please provide an input!");
      return error;
    }else {
      DoublingModel doublingModel = new DoublingModel((input));
      return ResponseEntity.status(HttpStatus.CREATED).body(doublingModel);
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name, String title){

    if(name == null){
      GreetingError error = new GreetingError();
      error.setError("Please provide a name!");
      return error;
    }else if(title == null){
      GreetingError error = new GreetingError();
      error.setError("Please provide a title!");
      return error;
    }
    else{
      Greeting greeting = new Greeting();
      greeting.setWelcome_message(name, title);
      return  ResponseEntity.status(HttpStatus.CREATED).body(greeting);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendable(@PathVariable(value = "appendable", required = false)String appendable){
    AppendA appendA = new AppendA();
    appendA.set_appendedA(appendable);
    return appendA;
  }


  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable(value = "action", required = false) String action, @RequestBody(required = false) UntilNumber until){
    if(until == null) {
      Error error = new Error();
      error.setError("Please provide a number!");
      return error;
    }

    if(action.equals("sum")){
      DoUntil doUntil = new DoUntil();
      doUntilService.sum(until.getUntil(),doUntil);
      return doUntil;
    }
    if(action.equals("factor")){
      DoUntil doUntil = new DoUntil();
      doUntilService.factor(until.getUntil(),doUntil);
      return doUntil;
    }
    return "";
  }


}
