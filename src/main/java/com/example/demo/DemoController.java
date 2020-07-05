package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
   @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
   @RequestMapping(value = "/view-products")
   public String viewProducts() {
      return "view-products";
   }
   @RequestMapping("/add-products")
   public String addProducts() {
      return "add-products";
   }
}