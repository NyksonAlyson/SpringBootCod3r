package com.nykdev.springboot.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	// METODO PARA INSERIR PRODUTOS NO BANCO DE DADOS
	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
	produtoRepository.save(produto);
		return produto;
	} 
	// METODOS PARA RETORNAR TODOS OS PRODUTOS DO BANCO
	@GetMapping
	public Iterable<Produto> ObterProduto() {
		return produtoRepository.findAll();
	}
	// METODO PARA RETORNAR PRODUTOS POR ID
	@GetMapping(path = "/{id}")
	public Optional<Produto> ObterProdutoID(@PathVariable int id) {
	return produtoRepository.findById(id);
	
	}
	// METODO PARA ALTERA INFORMAÇÕES DO PRODUTO ATRAVEZ DO ID
	@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		return produtoRepository.save(produto);
		 
	}

}
