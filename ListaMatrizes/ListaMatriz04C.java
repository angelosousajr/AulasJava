public class ListaMatriz04C {
    public static void main(String[] args){
        double [][] m = new double [4][4];
        double [][] transposta = new double [4][4];

        System.out.println("Sorteando números decimais...");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = (Math.random()*9)+1;
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                transposta[j][i] = m[i][j];
            }
        }

        System.out.println("");
        System.out.println("A matriz original:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%.2f  ", m[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("A matriz transposta:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%.2f  ", transposta[i][j]);
            }
            System.out.println("");
        }

    }
}
