package com.sample;

import javax.swing.*;

public class Carro {

    public String marca;
    public int ano;
    private int marcha;
    public boolean ligado;
    public int velocidade;
    public boolean freio = true;

    public void ligar(){

        if (this.ligado == true){
            System.out.println("O carro ja esta ligado");
            JOptionPane.showMessageDialog(null, "O carro ja esta ligado");
        } else {
            // this recebe valor do atributo da mesma classe
            // super recebe valor do atributo da classe pai
            this.ligado = true;
            System.out.println("Carro ligado");
            JOptionPane.showMessageDialog(null, "Carro ligado");
        }
    }

    public void acelerar(int velocidade) {

        if (ligado == true && freio == false) {
            if (marcha == 0) {
                this.velocidade = velocidade;
                JOptionPane.showMessageDialog(null, this.velocidade);
            } else if (marcha == 1 && velocidade < 30) {
                this.velocidade = velocidade;
                JOptionPane.showMessageDialog(null, this.velocidade);
            } else if (marcha == 2 && velocidade < 50) {
                this.velocidade = velocidade;
                JOptionPane.showMessageDialog(null, this.velocidade);
            } else if (marcha == 3 && velocidade < 80) {
                this.velocidade = velocidade;
                JOptionPane.showMessageDialog(null, this.velocidade);
            } else if (marcha == 4 && velocidade >= 80) {
                this.velocidade = velocidade;
                JOptionPane.showMessageDialog(null, this.velocidade);
            }
        } else {
            JOptionPane.showMessageDialog(null, "carro desligado");
        }
    }

    public void desligar(){
        if (this.ligado == false){
            System.out.println("O carro ja esta desligado");
        } else {
            this.ligado = false;
            System.out.println("Carro desligado");
        }
    }

    public void trocarMarcha(){
        this.marcha = this.marcha + 1;
    }
}
