package com.sample;

import java.util.Scanner;

public class matrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de pessoas entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomeFilhos = new String[numEntrevistados][];
		
		for (int i=0; i<nomeFilhos.length; i++) {
			
			System.out.println("Entre com o numero de filhos: ");
			int qtdeFilhos = scan.nextInt();
			nomeFilhos[i] = new String[qtdeFilhos];
			
			for (int j=0; j<nomeFilhos[i].length; j++) {
			
				System.out.println("Entre com o nome do filho " + (j+1) + ":");
				nomeFilhos[i][j] = scan.next();	
			
			}
		}
		
		for (int i=0; i<nomeFilhos.length; i++) {
			System.out.println("Pessoa " + i + " possui " + nomeFilhos[i].length + " filhos");
			for (int j=0; j<nomeFilhos[i].length; j++) {
				System.out.println(nomeFilhos[i][j]);
			}
		}

	}

}
