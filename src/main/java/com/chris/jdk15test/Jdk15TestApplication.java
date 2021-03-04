package com.chris.jdk15test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Jdk15TestApplication {

  public static void main(String[] args) {
    SpringApplication.run(Jdk15TestApplication.class, args);

    log.info("we're on!");
  }

}
