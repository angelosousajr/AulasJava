public class ListaMatriz04A {
    public static void main(String[] args){
        int [][] m = new int[4][4];

        System.out.println("Sorteando números...");
        for(double i = 0; i < 4; i++){
            for(double j = 0; j < 4; j++){
                m[i][j] = (double)(Math.random()*9)+1;
            }
        }

        System.out.println("Elementos da diagonal secundária:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if (i == 0 && j == 3){
                    System.out.println(m[i][j]);
                }   else if(i == 1 && j == 2){
                    System.out.println(m[i][j]);
                }   else if(i == 2 && j == 1){
                    System.out.println(m[i][j]);
                }   else if(i == 3 && j == 0){
                    System.out.println(m[i][j]);
                }
            }
            System.out.println("");
        }
    }
}