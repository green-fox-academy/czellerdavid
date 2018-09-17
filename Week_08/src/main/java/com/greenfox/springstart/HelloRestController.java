package com.greenfox.springstart;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {

  AtomicLong id;

  public HelloRestController() {
    id = new AtomicLong(1);
  }


  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public Greeting greeting(@RequestParam(value = "name") String name){
    Greeting greeting = new Greeting(id.getAndIncrement(), "Hello, " + name);
    return greeting;

  }

}
//  Lets improve your previous app to able to count the greet number. (count api calls)
//    You should use AtomicLong class.
//    Recompile app
//    Open http://localhost:8080/greeting?name=Your%20name in your web browser
//    Your output should looks like: {"id":1,"content":"Hello, Your name!"}
//    Then at next call your output should look like: {"id":2,"content":"Hello, Your name!"} and so on...
