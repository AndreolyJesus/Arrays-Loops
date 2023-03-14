import java.util.Scanner;

public class Loop {

    /*
    Faça um programa que leia conjuntos de dois valores,
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
    (Pare o programa inserindo o valor 0 no campo nome)
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");

    }

}
/*
existe a variável contador que é iniciada como "nome",
a cada loop executado (repetição) é somado 1 ao contador.
Perceba que o while irá manter a repetição enquanto a variável contador for menor que 0.
 */
