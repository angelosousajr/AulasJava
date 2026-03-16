public class ListaMatriz05C {
    public static void main(String[] args) {
        int [][] m = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if (i == j){
                    System.out.print(" *");
            }   else if(j == 0){
                    System.out.print(" *");
            }   else if(i > 0 && j == 1){
                    System.out.print(" *");
            }   else if(i > 1 && j == 2){
                    System.out.print(" *");
            }   else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
