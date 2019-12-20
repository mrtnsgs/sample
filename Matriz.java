package com.sample;

public class Matriz {

	public static void main(String[] args) {
		
		// Declarando matriz e criando vetor de vetores
		double[][] notasAlunos = new double[3][4]; 
		// declarando toda matriz de uma vez só
		double[][] notasAlunos2 = {{10, 9.7, 8.5, 10.9}, {8, 7.7, 2.5, 1.9}, {6, 8.7, 9.5, 9.9}};
		
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] =	9.7;
		notasAlunos[0][2] =	8.5;
		notasAlunos[0][3] = 10.9;
		
		notasAlunos[1][0] = 8;
		notasAlunos[1][1] =	7.7;
		notasAlunos[1][2] =	2.5;
		notasAlunos[1][3] = 1.9;
		
		notasAlunos[2][0] = 6;
		notasAlunos[2][1] =	8.7;
		notasAlunos[2][2] =	9.5;
		notasAlunos[2][3] = 9.9; 
		
		// a variavel i assume como contador no segundo for em primeiro momento
		// no println ele assume a posição 0 e roda 0 0, 0 1... ate completar o laço
		// depois o i assume no print 1 e depois 2
		
		double soma;
		for (int i = 0; i<notasAlunos.length; i++) {
		
			soma = 0;
			for (int j = 0; j<notasAlunos[i].length; j++) {
				//System.out.println(notasAlunos[i][j] + " ");
				soma += notasAlunos[i][j];
			}
			System.out.println("A média do aluno: " + (i+1) + " é " + (soma / notasAlunos.length));
		}
	}

}
