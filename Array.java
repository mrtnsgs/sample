package com.sample;

public class Array {
	
	public static void main(String[] args) {
		//double tempDia01 = 33.1 ; 
		//double tempDia02 = 23.9 ;
		//double tempDia03 = 43.3 ;
		//double tempDia04 = 73.5 ;
		//double tempDia05 = 26.7 ;
		
		// Deve ser declarado o tamanho do vetor/array antes de declarar cada posição
		double temperaturas[] = new double[365];
		temperaturas[0] = 33.1;
		temperaturas[1] = 23.9;
		temperaturas[2] = 43.3;
		temperaturas[3] = 73.5;
		temperaturas[4] = 26.7;
		
		System.out.println(temperaturas[2]);
		System.out.println(temperaturas.length);
		
		// nesse for é possivel ter acesso ao contador
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
		}
		
		// nesse for só se tem acesso ao valor final da variavel'temp'
		//for (double temp : temperaturas) {
		//	System.out.println(temp);
		//}
		
	}
}
