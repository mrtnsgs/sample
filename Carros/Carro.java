package com.sample.Carros;

public class Carro {
	
	double capCombustivel = 11.1;
	double consumoCarro = 10.2;
	
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCarro);
	}
	
	double obterAutonomia() {
		
		return capCombustivel * consumoCarro;
	}
	
	
	double calcularCombustivel(double km) {
		
		double qtdeCombustivel = km/consumoCarro;
		return qtdeCombustivel;
	}
}
