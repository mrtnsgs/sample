package com.sample;

public class MatrizTridimensional {

	public static void main(String[] args) {
		//int[][][] matrizTridimensional = { { {},{},{} }, { {},{},{} }, { {},{},{} }};
		int[][][] matrizTridimensional = new int[3][3][3];
		
		for (int i=0; i < matrizTridimensional.length; i++) {
			for (int j=0; j < matrizTridimensional[i].length; j++) {
				for (int k=0; k < matrizTridimensional[i][j].length; k++) {
					//System.out.println(matrizTridimensional[i][j][k]);
					matrizTridimensional[i][j][k] = i + j + k;
					System.out.println(matrizTridimensional[i][j][k]);
				}
			}
			System.out.println("");
		}
		
		int soma = 0;
		for (int i=0; i < matrizTridimensional.length; i++) {
			for (int j=0; j < matrizTridimensional[i].length; j++) {
				for (int k=0; k < matrizTridimensional[i][j].length; k++) {
					//System.out.println(matrizTridimensional[i][j][k]);
					//matrizTridimensional[i][j][k] = i + j + k;
					soma += matrizTridimensional[i][j][k];
				}
			}
		}
		
		System.out.println("A soma dos elementos é : " + soma);
		
		int pares = 0;
		int impares = 0;
		
		for (int i=0; i < matrizTridimensional.length; i++) {
			for (int j=0; j < matrizTridimensional[i].length; j++) {
				for (int k=0; k < matrizTridimensional[i][j].length; k++) {
					//System.out.println(matrizTridimensional[i][j][k]);
					matrizTridimensional[i][j][k] = i + j + k;
					
					if (matrizTridimensional[i][j][k] % 2 == 0) {
						pares += matrizTridimensional[i][j][k];
					} else {
						impares += matrizTridimensional[i][j][k];
					}
				}
			}
		}
		System.out.println("A soma dos elementos pares : " + pares);
		System.out.println("A soma dos elementos impares : " + impares);
	}

}
