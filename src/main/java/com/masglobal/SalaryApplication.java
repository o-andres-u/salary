package com.masglobal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SalaryApplication {

  public static void main(String[] args) {
    SpringApplication.run(SalaryApplication.class, args);
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/employees").allowedOriginPatterns("http://localhost:3000");
        registry.addMapping("/employees/{id}").allowedOriginPatterns("http://localhost:3000");
      }
    };
  }
}
