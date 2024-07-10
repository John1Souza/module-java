package com.spring.concepts.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String nome;    
    
    @Min(0)
    private double preco;

    @Min(0)
    @Max(1)
    private double desconto;

    public Produto(){

    }

    public Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public int obterId(){
        return id;
    }

    public void definirId(int id){
        this.id = id;
    }

    public String obterNome(){
        return nome;
    }

    public void definirNome(String nome){
        this.nome = nome;
    }

    public double obterPreco(){
        return preco;
    }

    public void definirPreco(double preco){
        this.preco = preco;
    }

    public double obterDesconto(){
        return desconto;
    }

    public void definirDesconto(double desconto){
        this.desconto = desconto;
    }
}