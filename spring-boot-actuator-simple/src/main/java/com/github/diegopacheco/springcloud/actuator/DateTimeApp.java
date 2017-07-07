package com.github.diegopacheco.springcloud.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/date")
@SpringBootApplication
public class DateTimeApp {
  
  @RequestMapping(method=RequestMethod.GET)
  public @ResponseBody String dateTime() {
    return new java.util.Date().toString();
  }

  public static void main(String[] args) {
    SpringApplication.run(DateTimeApp.class, args);
  }

}
