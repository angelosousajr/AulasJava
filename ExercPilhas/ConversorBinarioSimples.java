import java.util.Scanner;
public class ConversorBinarioSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int numeroOriginal = numero;
        String binario = "";

        if (numero == 0){
            binario = "0";
        }else{
            while (numero > 0){
                int resto = numero % 2;
                
                binario = resto + binario;

                numero = numero / 2;
            }
        }

        System.out.println("O número " + numeroOriginal + " em binário é: " + binario + "b");

        leitor.close();
    }
}
