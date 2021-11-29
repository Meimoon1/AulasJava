package com.capgemini.filmes.repository;

import com.capgemini.filmes.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer>{
    
}