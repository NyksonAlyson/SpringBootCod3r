package com.nykdev.springboot.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nykdev.springboot.models.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	 
}
