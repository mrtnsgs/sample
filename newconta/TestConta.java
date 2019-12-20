package com.sample.newconta;

public class TestConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumeroConta(123456);		
		
		conta.setLimiteEspecial(150);
		conta.setAgencia("abc");		
		
		conta.depositar(149);
		conta.sacar(150.0);
		       
		System.out.println("Saldo da conta " + conta.getNumeroConta() + " e agencia " + conta.getAgencia() + " = " + conta.getSaldo());
	}

}
