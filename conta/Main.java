package com.sample.conta;

public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);
        cc.sacar(50);
        cc.verSaldo();

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(100);
        cp.verSaldo();

       
        /*
        String[] paises = {"Brasil", "EUA", "Portugal", "Argentina"};
        int[] numeros = {1, 2, 3, 4};
        
        // Varre o array de forma manual
        for (int i = 0; i < paises.length; i++){
        	//System.out.println(paises[i]);
        }
        
        for (String pais: paises) {
        	System.out.println(pais);
        }
        
        int e = 0;
        while (e < 5) {
        	System.out.println(paises[e]);
        	e++;
        }*/
    }
}
