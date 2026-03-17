public class ListaMatriz03A {
    public static void main(String[] args) {
        int [][] m = new int [3][5];
        int [] contador = new int [10];

        System.out.println("Sorteando números...");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                m[i][j] = (int)(Math.random()*9)+1;
                contador[m[i][j]]++;
            }
        }

        System.out.println("");
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        for(int n = 0; n < contador.length; n++){
            if (contador[n] > 1){
                System.out.println("Sim, existem números repetidos.");
                return;
            }
        }

        System.out.println("Não há números repetidos.");
    }
}
