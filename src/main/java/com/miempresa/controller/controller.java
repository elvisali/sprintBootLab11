package com.miempresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {
	
	@GetMapping("/saludo")
	public String saludo(
			@RequestParam(name="mensaje",
			required = false,
			defaultValue = "hola") String name, Model model) { 
		model.addAttribute("mensaje", name);
	
		return "saludo"; 
	}
	
	@GetMapping("/operaciones")
	public String operaciones(
			@RequestParam(name="num1") String num1, 
			@RequestParam(name="num2") String num2,
			@RequestParam(name="ope") String ope,
			Model model) { 
		Double numero1 = Double.parseDouble(num1);
		Double numero2 = Double.parseDouble(num2);
		Double respuesta = 0.0;
		String operador ="";
		switch (ope) {
		case " ":  operador="Suma"; respuesta = numero1+numero2; break;
		case "-": operador="Resta"; respuesta = numero1-numero2;break;
		case "*": operador="Multiplicacion"; respuesta = numero1*numero2;break;
		case "/": operador="Division"; respuesta = numero1/numero2;break;
		}
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("ope", ope);
		model.addAttribute("rpta", respuesta); 
	
		return "operaciones"; 
	}
}
