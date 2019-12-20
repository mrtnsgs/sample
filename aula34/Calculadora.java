package com.sample.aula34;

public class Calculadora {
	
	public static int soma (int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtracao (int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicacao (int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divisao (int num1, int num2) {
		return num1 / num2;
	}
	
	public static int potencia (int num1, int num2) {
		
		int result=0;
		
		for (int i=0; i<num2; i++) {
			result *= num1;
		}
		
		return result;
	}
	
	public static int fatorialNaoRecursivo (int num1) {
		
		if (num1 == 0 ) {
			return 1;
		}
		
		int result=1;
		for(int i=num1; i>1; i--) {
			result *= i; 
		}
					
		return result;
	}
	
	public static int fatorial(int num1) {
		
		if(num1 == 0) {
			return 1;
		}
		
		return num1 * fatorial(num1 - 1);
	}	
	
}
