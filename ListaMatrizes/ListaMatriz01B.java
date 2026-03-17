public class ListaMatriz01B {
   public static void main(String[] var0) {
      int[][] var1 = new int[][]{{19, 25, 100, 99}, {10, 7, 25, 14}, {35, 2, 47, 74}};

      for(int var2 = 0; var2 < var1.length; ++var2) {
         for(int var3 = 0; var3 < var1[var2].length; ++var3) {
            System.out.print(var1[var2][var3] + " ");
         }

         System.out.println();
      }

   }
}