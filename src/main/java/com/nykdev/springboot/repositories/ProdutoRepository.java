package com.nykdev.springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nykdev.springboot.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	 
}
