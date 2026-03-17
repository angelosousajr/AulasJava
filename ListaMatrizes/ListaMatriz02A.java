public class ListaMatriz02A {
    public static void main(String[] args){
        int [][] m = new int[5][5];

        System.out.println("Sorteando números...");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                m[i][j] = (int)(Math.random()*9)+1;
            }
        }

        System.out.println("");
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Soma dos números impares:");
        int somaImpares = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(m[i][j] % 2 != 0){
                    somaImpares = somaImpares + m[i][j];
                }
            }
        }
        System.out.println(somaImpares);
    }
}
