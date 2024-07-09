package com.spring.concepts.controllers;

import com.spring.concepts.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }
}