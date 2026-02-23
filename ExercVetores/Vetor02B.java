import javax.swing.JOptionPane;
public class Vetor02B {
    public static void main(String[] args) {
        double vet[] = new double[5];

    for (int i = 0; i < 5; i++){
        vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
    }
    System.out.println("Os números digitados:");
    for (int i = 0; i < 5; i++){
        System.out.println(vet[i]);
    }
  }
}
