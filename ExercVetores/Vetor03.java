import javax.swing.JOptionPane;
public class Vetor03 {
    public static void main(String[] args) {
        double soma;
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas:"));
        double vet[] =  new double[n];

        for (int i = 0; i < n; i++){
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota:"));
        }
        soma = 0;
        for (int i = 0; i < n; i++){
            soma += vet [i];
        }

        System.out.println("A média é " + soma/n);
        if (soma>=70){
            System.out.println("Você foi aprovado!");
        }else{
            System.out.println("Você foi reprovado.");
        }
    }
}
