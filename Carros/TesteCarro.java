package com.sample.Carros;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.exibirAutonomia();
		double consumo = van.obterAutonomia();
		
		System.out.println(consumo);
		
		
		
		double consumoCombu = van.calcularCombustivel(10);
		System.out.println(consumoCombu);
		
		//
		System.out.println(van.calcularCombustivel(10));
	}

}
