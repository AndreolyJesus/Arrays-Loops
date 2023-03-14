package src.calculadora;

import java.util.Scanner;

public class Calculadora {

    private int numero1;
    private int numero2;
    private String operacao;

    public Calculadora (int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    public int soma() {
        return numero1 + numero2;
    }

    public int subtracao() {
        return numero1 - numero2;
    }

    public int multiplicacao() {
        return numero1 * numero2;
    }

    public int divisao() {
        return numero1 / numero2;
    }

}
