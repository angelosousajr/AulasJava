public class ListaMatriz04A {
    public static void main(String[] args){
        double [][] m = new double [4][4];

        System.out.println("Sorteando números decimais...");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = (Math.random()*9)+1;
            }
        }

        System.out.println("Elementos da diagonal principal:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == j){
                    System.out.println("%.2f  ", m[i][j]);
            }
        }
        System.out.println("");
        }
    }
}
