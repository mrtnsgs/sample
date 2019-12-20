package com.sample.aula34;

public class Contador {

	static int increment;
	
	public Contador() {
		increment++;
	}
	
	public int zerarContador() {
		return increment = 0;
		
	}
	
	public int incrementar() {
		return increment++;
		
	}
	
	public int retornarValor() {
		return increment;
		
	}
	
}
