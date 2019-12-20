package com.sample.newconta;

public class Conta {

	
    private double saldo;
    private int numeroConta;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    
    public boolean sacar(double valor){
    	
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
        	if ( valor <= this.limiteEspecial) {
        		this.limiteEspecial -= valor;
        		return false;      		
        	} else {
        		System.out.println("Saldo insuficiente");
        		return false;
        	}
        }
    }

    // Método pra depositar
    public void depositar(double valor){
        this.saldo += valor;
    }
    public double getSaldo(){
        //System.out.println("O saldo da Conta é: " + this.saldo);
    	return saldo;
    }

    
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getNumeroConta() {
		return numeroConta;
	}

	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getAgencia() {
		return this.agencia;
	}
	
	public boolean isEspecial() {
		return especial;
	}


	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

}