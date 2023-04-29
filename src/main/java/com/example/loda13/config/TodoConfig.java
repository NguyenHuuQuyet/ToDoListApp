package com.example.loda13.config;

import com.example.loda13.TodoValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {
    @Bean
    public TodoValidator validator(){
        return new TodoValidator();
    }
}
