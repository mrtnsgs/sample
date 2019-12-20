package com.sample.conta;

public class ContaCorrente extends Conta {

    //Rescrever o metodo da classe pai
    // overriding - rescrever o metodo
    public void sacar (double valor){
        super.sacar(valor);
        this.juro();
    }

    private void juro (){
        this.saldo -= 1;
    }
}
