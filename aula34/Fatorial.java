package com.sample.aula34;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        
        int num;
        
        do {
            
            System.out.println("Entre com um número positivo");
            num = scan.nextInt();
            
            if (num < 0){
                System.out.println("Número inválido, entre novamente");
            }
            
        } while (num < 0);
        
        System.out.println(Calculadora.fatorialNaoRecursivo(num));*/
	
		int fatorialNaoRecursivo = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNaoRecursivo);
		
		int fatorialRecursivo = Calculadora.fatorial(5);
		System.out.println(fatorialRecursivo);
	}
	
}
