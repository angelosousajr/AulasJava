public class ListaMatriz02C {
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

        System.out.println("Soma dos elementos da linha 1:");
        int somaLinha1 = 0;
        for(int j = 0; j < 5; j++){
            somaLinha1 = somaLinha1 + m[0][j];
        }
        System.out.println(somaLinha1);
        System.out.println("");

        System.out.println("Soma dos elementos da linha 2:");
        int somaLinha2 = 0;
        for(int j = 0; j < 5; j++){
            somaLinha2 = somaLinha2 + m[1][j];
        }
        System.out.println(somaLinha2);
        System.out.println("");

        System.out.println("Soma dos elementos da linha 3:");
        int somaLinha3 = 0;
        for(int j = 0; j < 5; j++){
            somaLinha3 = somaLinha3 + m[2][j];
        }
        System.out.println(somaLinha3);
        System.out.println("");

        System.out.println("Soma dos elementos da linha 4:");
        int somaLinha4 = 0;
        for(int j = 0; j < 5; j++){
            somaLinha4 = somaLinha4 + m[3][j];
        }
        System.out.println(somaLinha4);
        System.out.println("");

        System.out.println("Soma dos elementos da linha 5:");
        int somaLinha5 = 0;
        for(int j = 0; j < 5; j++){
            somaLinha5 = somaLinha5 + m[4][j];
        }
        System.out.println(somaLinha5);
        System.out.println("");
    }
}
