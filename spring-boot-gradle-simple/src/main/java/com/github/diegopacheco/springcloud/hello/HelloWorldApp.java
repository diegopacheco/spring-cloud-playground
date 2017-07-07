package com.github.diegopacheco.springcloud.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
@SpringBootApplication
public class HelloWorldApp {
  
  @RequestMapping(method=RequestMethod.GET)
  public @ResponseBody String sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
    return "Hello World Sprinb Boot: " + name;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloWorldApp.class, args);
  }

}
