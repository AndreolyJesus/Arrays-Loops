package src.calculadora;

import java.util.Scanner;

public class Layout {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a numero: ");
        int numero1 = scan.nextInt();

        System.out.println("Entre com a operação: ");
        String operacao = scan.next();

        System.out.println("Entre com 2 numero: ");
        int numero2 = scan.nextInt();


        Calculadora calculadora = new Calculadora(numero1, numero2);


        if (operacao.equals("+")) {
            System.out.println("Resultado da soma: " + calculadora.soma());
        } else if (operacao.equals("-")) {
            System.out.println("Resultado da subtracao : " + calculadora.subtracao());
        } else if (operacao.equals("*")) {
            System.out.println("Resultado da multiplicacao: " + calculadora.multiplicacao());
        } else if (operacao.equals("/")) {
            System.out.println("Resultado da divisao: " + calculadora.divisao());
        }


    }

}

