package com.sample.aula34;


public class TestCalculadora {

	public static void main(String[] args) {
        imprimirTela(Calculadora.soma(1, 2));
        
        imprimirTela(Calculadora.subtracao(2, 1));
        
        imprimirTela(Calculadora.multiplicacao(2, 2));
        
        imprimirTela(Calculadora.divisao(4, 2));
        
        imprimirTela(Calculadora.potencia(2, 4));
        
        imprimirTela(Calculadora.fatorial(10));
        
	}

	private static void imprimirTela(int num) {
		System.out.println(num);
		
	}
	


}
