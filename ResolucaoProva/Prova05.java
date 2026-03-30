import java.util.Scanner;
public class Prova05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [][] m = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite um valor para compor a matriz: ");
                m[i][j] = scanner.nextInt();
            }
        }
        System.out.println("");

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i==j){
                    System.out.println("O elemento da diagonal" +" i" + i + " j" + j + " é" + " " + m[i][j]);
                }
            }
        }
    }
}
