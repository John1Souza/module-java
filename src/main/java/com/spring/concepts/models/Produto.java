package com.spring.concepts.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String nome;

    public Produto(){

    }

    public Produto(String nome){
        this.nome = nome;
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
}