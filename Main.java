package com.sample;

public class Main {

    public static void main(String[] args) {

        // uma classe instanciada é um objeto
        Carro c4 = new Carro();
        c4.ligar();
        c4.freio = false;

        c4.trocarMarcha();
        c4.acelerar(25);
        c4.trocarMarcha();
        c4.acelerar(35);
        c4.trocarMarcha();
        c4.acelerar(55);
        c4.trocarMarcha();
        c4.acelerar(85);

        c4.desligar();

        Carro ix35 = new Carro();
        //ix35.ligar();
        //ix35.desligar();

    }

}
