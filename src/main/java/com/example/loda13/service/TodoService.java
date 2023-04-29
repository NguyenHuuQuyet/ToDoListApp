package com.example.loda13.service;

import com.example.loda13.Todo;
import com.example.loda13.TodoValidator;
import com.example.loda13.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private TodoValidator validator;
    public List<Todo> findAll(Integer limit){
        return Optional.ofNullable(limit)
                .map(value -> todoRepository.findAll(PageRequest.of(0,value)).getContent())
                .orElseGet(()->todoRepository.findAll());
    }
    public Todo add(Todo todo){
        if(validator.isValid(todo)){
            return todoRepository.save(todo);

        }
        return null;
    }
}
