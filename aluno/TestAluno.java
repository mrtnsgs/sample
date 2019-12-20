package com.sample.aluno;

import java.util.Scanner;

public class TestAluno {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		
		System.out.println("Entre com o nome do aluno: ");
		aluno.nome = ler.next();
		
		System.out.println("Entre com a matricula do aluno: ");
		aluno.matricula = ler.nextInt();		
		
		
		for (int i=0; i<aluno.curso.length; i++) {
			System.out.println("Entre com a disciplina " + (i+1) );
			aluno.curso[i] = ler.next();
			
			for (int j=0; j<aluno.notas[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1));
				aluno.notas[i][j] = ler.nextDouble();
			}
		}
		
		aluno.exibirResultados();
		aluno.calcularMedia(0);
	}

}
