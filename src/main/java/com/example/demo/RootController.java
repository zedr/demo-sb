package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

  @RequestMapping("/")
  public String greeting() {
    return "Benvenuti all'applicazione demo!";
  }
}
