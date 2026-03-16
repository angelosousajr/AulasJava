public class MatrizAleatoria {
    public static void main(String[] args) {
        int [][] m = new int[3][3];
        System.out.println("Sorteando números...");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m[i][j] = (int)(Math.random()*9)+1;
            }
        }
        System.out.println("Matriz preenchida!");
        System.out.println("Conteúdo de cada posição da matriz:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("m["+i+"]["+j+"] = "+m[i][j]);
            }
        }
        System.out.println("Conteúdo da matriz completa:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(m[i][j]+ "  ");
            }
            System.out.println("");
        }
        System.out.println("Soma dos elementos da coluna 3:");
        int somaColuna3 = 0;
        for(int i = 0; i < 3; i++){
            somaColuna3 = somaColuna3 + m[i][2];
        }
        System.out.println(somaColuna3);

    }
}
