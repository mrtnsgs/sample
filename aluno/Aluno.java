package com.sample.aluno;

public class Aluno {
	
	String nome;
	int matricula;
	double[][] notas = new double[3][4];
	String[] curso = new String[3];
	
	public Aluno() {
		
		
	}
	
	
	// implementar futuramente essa verificação
	/*public void verificarAprovado(int indice) {
		
		for (int i=0; i<notas[indice].length; i++) {
			
		}
	}*/
	
	public void calcularMedia(int indice) {
		
		double soma = 0;
		for (int i=0; i<notas[indice].length; i++) {
			soma += notas[indice][i];
		}
		
		double media = soma/4;
		
	}
	
	public void exibirResultados() {
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println(" ");
		
		for (int i=0; i<curso.length; i++) {
			for (int j=0; j<notas[i].length; j++) {
				System.out.println("A " + (j+1) + " nota da disciplina " + curso[i] + " é " + notas[i][j]);
			}
		}
	}
}

/**
 * Atualmente esta dessa forma:
 * informa o nome do aluno
 * informa a matricula
 *  informa a primeira materia
 *  informa as notas dessa materia
 *  informa a segunda materia
 *  informa as notas da segunda materia
 *  informa a terceira materia
 *  informa as notas da terceira materia
 * calcular a media das tres notas e informa se 
 * 
 * 
 * 
 *	o programa deverá executar dessa forma: 
 *  informa o nome do aluno
 *  informa a primeira materia
 *  informa as notas dessa materia
 *  informa a segunda materia
 *  informa as notas da segunda materia
 *  informa a terceira materia
 *  informa as notas da terceira materia
 *  informa a nota de cada disciplina, a media e se foi aprovado na mesma
*/