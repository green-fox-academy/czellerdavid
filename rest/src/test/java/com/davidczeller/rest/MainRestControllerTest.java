package com.davidczeller.rest;

import com.davidczeller.rest.Controller.MainRestController;
import com.davidczeller.rest.Service.DoUntilService;
import com.davidczeller.rest.model.Error;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.nio.charset.Charset;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MainRestController.class)
public class MainRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private DoUntilService mainService;
  private Error error;


  // if an additional service layer is used
  // - meaning not all logic is added to the controller and you have Autowired fields in it -
  // then you have to mock out the service class like below
  //
  //@MockBean
  //private UserService userService;

  @Test
  public void doubling() throws Exception {

    int input = 15;
    int result = 30;


    mockMvc.perform(get("/doubling?input=" + input))
        .andExpect(status().isCreated())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.received", is(input)))
        .andExpect(jsonPath("$.result", is(result)))
        .andDo(print());
  }

  @Test
  public void doublingErrorHandling() throws Exception {

    String expectedErrorMsg = "Please provide an input!";

    mockMvc.perform(get("/doubling"))
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is(expectedErrorMsg)))
        .andDo(print());
  }
}

