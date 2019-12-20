package com.sample.relacionamentos;

public class Agenda {

	private String nome;
	private Contatos contato[];
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contatos[] getContato() {
		return contato;
	}
	public void setContato(Contatos[] contato) {
		this.contato = contato;
	}	 
	
}