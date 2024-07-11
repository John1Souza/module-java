package com.spring.concepts.models.repositories;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome){

    }
}