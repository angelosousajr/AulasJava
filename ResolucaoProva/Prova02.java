public class Prova02 {
    public static void main(String[] args) {
        double[] valores = {10.5, 20.0, 30.5, 40.0};
        double soma = 0;

        for(int i=0; i<valores.length; i++){
            soma = soma + valores[i];
        }

        double media = soma/valores.length;
        System.out.println("Soma: " + soma + " | Média: " + media);
    }
}
