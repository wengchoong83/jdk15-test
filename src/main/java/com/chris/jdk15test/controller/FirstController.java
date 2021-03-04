package com.chris.jdk15test.controller;

import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class FirstController {

  @RequestMapping("/")
  public String getHello(HttpServletRequest request) {
    log.info("we're in business: " + request.getRemoteAddr());
    
    return "why hello there!";
  }
}
