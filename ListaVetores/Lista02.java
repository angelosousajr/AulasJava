import java.util.Scanner;

public class Lista02 {
    public static void main(String[] args) {

        String[] nomes;
        nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0, media;
        int i;

        for (i=0; i<=4; i++){
            System.out.println("Informe o nome do aluno número " + (i+1) + ": ");
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Informe a nota do aluno número " + (i+1) + ": ");
            notas[i] = new Scanner(System.in).nextDouble();
            soma = soma + notas[i];
        }

        media = soma / 5;
        System.out.println();
        System.out.println("A média dos alunos é: " + media);
        System.out.println();
        System.out.println("Lista dos alunos cuja nota é superior a média da turma:");
        for(i=0; i<=4; i++){
            if(notas[i] > media){
                System.out.println(nomes[i]);
            }
        }



    }
}

