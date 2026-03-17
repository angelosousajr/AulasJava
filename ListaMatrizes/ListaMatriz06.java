import javax.swing.JOptionPane;
public class ListaMatriz06 {
    public static void main(String[] args) {
        int [][] m = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m[i][j] = Integer.parseInt((JOptionPane.showInputDialog("Digite um número:")));
                //Nosso exemplo de Quadrado Perfeito: 6 1 8 7 5 3 2 9 4
            }
        }
        System.out.println("Conteúdo da matriz completa:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(m[i][j]+ "  ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Soma dos elementos da linha 1:");
        int somaLinha1 = 0;
        for(int j = 0; j < 3; j++){
            somaLinha1 = somaLinha1 + m[0][j];
        }
        System.out.println(somaLinha1);
        System.out.println("");

        System.out.println("Soma dos elementos da linha 2:");
        int somaLinha2 = 0;
        for(int j = 0; j < 3; j++){
            somaLinha2 = somaLinha2 + m[1][j];
        }
        System.out.println(somaLinha2);
        System.out.println("");

        System.out.println("Soma dos elementos da linha 3:");
        int somaLinha3 = 0;
        for(int j = 0; j < 3; j++){
            somaLinha3 = somaLinha3 + m[2][j];
        }
        System.out.println(somaLinha3);
        System.out.println("");

        System.out.println("Soma dos elementos da coluna 1:");
        int somaColuna1 = 0;
        for(int i = 0; i < 3; i++){
            somaColuna1 = somaColuna1 + m[i][0];
        }
        System.out.println(somaColuna1);
        System.out.println("");

        System.out.println("Soma dos elementos da coluna 2:");
        int somaColuna2 = 0;
        for(int i = 0; i < 3; i++){
            somaColuna2 = somaColuna2 + m[i][1];
        }
        System.out.println(somaColuna2);
        System.out.println("");

        System.out.println("Soma dos elementos da coluna 3:");
        int somaColuna3 = 0;
        for(int i = 0; i < 3; i++){
            somaColuna3 = somaColuna3 + m[i][2];
        }
        System.out.println(somaColuna3);
        System.out.println("");

        System.out.println("Soma dos elementos da diagonal 1:");
        int somaDiagonal1 = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j){
                    somaDiagonal1 = somaDiagonal1 + m[i][j];
                }
            }
        }
        System.out.println(somaDiagonal1);
        System.out.println("");

        System.out.println("Soma dos elementos da diagonal 2:");
        int somaDiagonal2 = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (i == 0 && j == 2){
                    somaDiagonal2 = somaDiagonal2 + m[i][j];
                }   else if(i == 2 && j ==0){
                    somaDiagonal2 = somaDiagonal2 + m[i][j];
                }   else if(i == 1 && j == 1){
                somaDiagonal2 = somaDiagonal2 + m[i][j];
                }
            }
        }
        System.out.println(somaDiagonal2);
        System.out.println("");

    }
}
