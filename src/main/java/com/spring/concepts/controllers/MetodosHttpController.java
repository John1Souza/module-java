package com.spring.concepts.controllers;

import org.springframework.web.bind.annotation.RestConfiguration;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    @GetMapping
    public String get(){
        return "Requisição GET";
    }

    @PostMapping
    public String get(){
        return "Requisição POST";
    }

    @PutMapping
    public String get(){
        return "Requisição PUT";
    }

    @PatchMapping
    public String get(){
        return "Requisição PATCH";
    }

    @DeleteMapping
    public String get(){
        return "Requisição DELETE";
    }
}