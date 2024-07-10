package com.spring.concepts.controller;



public class CalculadoraController {
    // /calculadora/somar/10/20
    @GetMapping("/calculadora")
    public somarNumeros(int a, int b){
        return a + b;
    }
    // /calculadora/subtrair?a=100&b=39
}