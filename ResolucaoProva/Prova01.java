import java.util.Scanner;

public class Prova01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];
        for(int i=0; i<5; i++){
            System.out.print("Digite o valor da nota: ");
            notas[i] = scanner.nextInt();
        }
        System.out.println("");

        System.out.println("As notas iguais ou maiores que 7: ");
        for(int i=0; i<5; i++){
            if(notas[i] >= 7){
                System.out.println(notas[i]);
            }
        }
    }
}
