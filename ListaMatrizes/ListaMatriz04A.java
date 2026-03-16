public class ListaMatriz04A {
    public static void main(String[] args){
        int [][] m = new int[4][4];

        System.out.println("Sorteando números...");
        for(double i = 0; i < 4; i++){
            for(double j = 0; j < 4; j++){
                m[i][j] = (double)(Math.random()*9)+1;
            }
        }

        System.out.println("Elementos da diagonal principal:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == j){
                    System.out.println(m[i][j]);
            }
        }
        System.out.println("");
        }
    }
}