package com.nykdev.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	// calculadora/somar/10/20
	@GetMapping("/somar/{a}/{b}")
	public double Somar(@PathVariable double a, @PathVariable double b) {
		return a+b;
	}
	@GetMapping("/subtrair")
	//calculadora/subtrair?a=23&b=21
	public double Subtrair(@RequestParam(name = "a") double a,@RequestParam(name = "b") double b) {
		return a-b;
	}
	
	@GetMapping("/multiplicar/{a}/{b}")
	public double multiplicar(@PathVariable double a, @PathVariable double b) {
		return a*b;
	}
	
	@GetMapping("/dividir/{a}/{b}")
	public double dividir(@PathVariable double a, @PathVariable double b) {
		return a/b;
	}

}
