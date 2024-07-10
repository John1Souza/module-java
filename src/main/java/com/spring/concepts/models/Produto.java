package com.spring.concepts.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double preco;

    private double desconto;

    private String nome;

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