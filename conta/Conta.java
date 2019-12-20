package com.sample.conta;

public class Conta {

        protected double saldo;
        public int conta;

        public void sacar(double valor){
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        }

        public void depositar(double valor){
            this.saldo += valor;
            this.saldo += 1;
            if (valor == 99) {
            	System.out.println("Voce foi sorteado");
            }
        }

        public void verSaldo(){
            System.out.println("O saldo da Conta é: " + this.saldo);
        }
}
