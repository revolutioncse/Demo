package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller  extends org.springframework.boot.web.support.SpringBootServletInitializer {
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(Controller.class);
   }
   public static void main(String[] args) {
      SpringApplication.run(Controller.class, args);
   }
   
   @RequestMapping(value = "/")
   public String hello() {
      return "Hello World";
   }
}