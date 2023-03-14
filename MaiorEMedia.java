import java.util.Scanner;

public class MaiorEMedia {

    /*
    Faça um programa que leia 5 números
    e informe o maior número
    e a média desses números.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 1;

        while (count < 1) {
            System.out.println("While: " + count);   // apenas contagem e comparação
            count = count + 1;
        }

        do {
            System.out.println("do While: " + count);    //loop primeiro depois comparação
            count = count + 1;
        } while (count < 1);

        //System.out.println("Maior: " + maior);
        //System.out.println("Média: " + (soma / 5));

        System.out.println(" fora do While: " + count);


    }
}
