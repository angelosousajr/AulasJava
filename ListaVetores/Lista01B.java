import java.util.Scanner;

public class Lista01B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[], n, maior, menor, i;
        double soma;

        System.out.println("Digite a quantidade de elementos: ");
        n = teclado.nextInt();

        vetor = new int[n];

        for (i=0; i<n; i++){
            System.out.printf("Informe o valor número " + (i+1) + ": ");
            vetor[i] = teclado.nextInt();
        }

        maior = vetor[0];

        for (i=0; i<n; i++){
            if(vetor[i]>maior){
                maior = vetor[i];
            }
        }

        menor = vetor[0];

        for (i=0; i<n; i++){
            if(vetor[i]<menor){
                menor = vetor[i];
            }
        }

        System.out.println("O maior valor é " + maior + " e o menor valor é " + menor + ".");

        soma = 0;

        for (i=0; i<n; i++){
            soma += vetor [i];
        }

        System.out.println("A média dos valores é: " + soma/n);

    }
}
