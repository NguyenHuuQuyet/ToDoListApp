package com.example.loda13;

import org.thymeleaf.util.StringUtils;

import java.util.Optional;

public class TodoValidator {
    public boolean isValid(Todo todo){
        return Optional.ofNullable(todo)
                .filter(t -> !StringUtils.isEmpty(t.getTitle()))
                .filter(t -> !StringUtils.isEmpty(t.getDetail()))
                .isPresent();
    }
}
