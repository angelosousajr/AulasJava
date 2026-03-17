public class ListaMatriz02B {
    public static void main(String[] args){
        int [][] m = new int[5][5];

        System.out.println("Sorteando números...");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                m[i][j] = (int)(Math.random()*9)+1;
            }
            System.out.println("");
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Soma dos elementos da coluna 1:");
        int somaColuna1 = 0;
        for(int i = 0; i < 5; i++){
            somaColuna1 = somaColuna1 + m[i][0];
        }
        System.out.println(somaColuna1);
        System.out.println("");

        System.out.println("Soma dos elementos da coluna 2:");
        int somaColuna2 = 0;
        for(int i = 0; i < 5; i++){
            somaColuna2 = somaColuna2 + m[i][1];
        }
        System.out.println(somaColuna2);
        System.out.println("");

        System.out.println("Soma dos elementos da coluna 3:");
        int somaColuna3 = 0;
        for(int i = 0; i < 5; i++){
            somaColuna3 = somaColuna3 + m[i][2];
        }
        System.out.println(somaColuna3);
        System.out.println("");

        System.out.println("Soma dos elementos da coluna 4:");
        int somaColuna4 = 0;
        for(int i = 0; i < 5; i++){
            somaColuna4 = somaColuna4 + m[i][3];
        }
        System.out.println(somaColuna4);
        System.out.println("");

        System.out.println("Soma dos elementos da coluna 5:");
        int somaColuna5 = 0;
        for(int i = 0; i < 5; i++){
            somaColuna5 = somaColuna5 + m[i][4];
        }
        System.out.println(somaColuna5);
        System.out.println("");
    }
}
