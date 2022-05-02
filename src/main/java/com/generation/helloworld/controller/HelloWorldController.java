package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloWorldController {

	@GetMapping 
	public String hello () {
		return "Hello World";
	}
	@GetMapping("/bms")
	public String bsm () { 
		return "Lista de BSM's <br /> Persistencia <br /> Mentalidade de crescimento "
    + "<br /> Responsabilidade Pessoal <br /> Orientação ao Futuro <br />"
    + "Responsabilidade Pessoal <br /> Orientação ao futuro <br />"
    + "Competencia Comportamental <br /> Comunicação <br /> Proatividade <br />"
    + "Orientação ao Detalhe <br /> Trabalho em Equipe";
	}
	@GetMapping("/objetivo")
	public String objetivo () {
		return "espero que spring acabe logo !!";
	}
}
