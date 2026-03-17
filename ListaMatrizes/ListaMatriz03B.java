public class ListaMatriz03B {
    public static void main(String[] args) {
        int [][] m = new int [3][5];
        int totalPares = 0;

        System.out.println("Sorteando números...");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                m[i][j] = (int)(Math.random()*9)+1;
                if(m[i][j] % 2 == 0){
                    totalPares++;
                }
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
        System.out.println("Total de números pares: " + totalPares);

    }
}