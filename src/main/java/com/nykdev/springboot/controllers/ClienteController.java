package com.nykdev.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nykdev.springboot.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	 
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "nykson", "10660365430");
		
	}
	
	@GetMapping("/{id}")
	public Cliente ObterClientePorId(@PathVariable int id) {
		return new Cliente(id , "Maria","090809201");
	}

	@GetMapping
	public Cliente ObterClientePorId2(
			@RequestParam(name = "id",defaultValue = "1") int id) {
		return new Cliente(id, "alyson alyson", "000999999");
	}
}
