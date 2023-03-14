

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Arrays {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};   //unidimensional só em uma coluna

        //System.out.println(vetor.length);

        System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");         // "matriz: multidimensao linhas e colunas"
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {          // <-- se usa -1 para contagem inversa e \n para pular uma linha
            System.out.print(vetor[i] + " ");
        }

    }
}
