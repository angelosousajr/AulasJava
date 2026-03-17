public class ListaMatriz01A{
    public static void main(String[] args){
        char [][] m = new char [4][5];
        char letra = 'a';

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                m[i][j] = letra;
                letra++;
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}