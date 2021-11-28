package com.capgemini.banco.repository;

import com.capgemini.banco.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme,Integer>{
    
}
