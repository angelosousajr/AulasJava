public class Prova03 {
    public static void main(String[] args) {
        int[] vet = {5, 12, 8, 20, 3};
        int maiorValor = 0;
        int indice = 0;

        for(int i=0; i<vet.length; i++){
            if(maiorValor < vet[i]){
                maiorValor = vet[i];
                indice = i;
            }
        }

        System.out.println("O maior valor é " + maiorValor + " no índice " + indice);
    }
}
