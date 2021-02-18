package com.nykdev.springboot.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nykdev.springboot.models.Produto;
import com.nykdev.springboot.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
	produtoRepository.save(produto);
		return produto;
	} 
	
	@GetMapping
	public Iterable<Produto> ObterProduto() {
		return produtoRepository.findAll();
	}

}
