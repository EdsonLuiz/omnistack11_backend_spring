package com.github.edsonluiz.omnistack11_backend_spring.utils;

import java.util.UUID;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class Generator {
  @Bean
  public String generateUUID() {
    return UUID.randomUUID().toString();
  }
}
