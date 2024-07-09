package com.spring.concepts.controllers;

@RestController
public class PrimeiroController {

    //@RequestMapping(method = RequestMethod.GET, path = "/ola")
    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola(){
        return "Olá Spring Boot!";
    }
}