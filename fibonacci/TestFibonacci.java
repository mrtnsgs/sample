package com.sample.fibonacci;

public class TestFibonacci {

	public static void main(String[] args) {
		imprimirTela(Fibonacci.seqFibRecursivo(10));
		//imprimirTela(RecursivoInt.RecursivoInt1(5));
		imprimirTela(Fibonacci.seqFib(10));
	}
	private static void imprimirTela(int num) {
		System.out.println(num);
		//System.out.println(num1);
		
	}
	
	

}
