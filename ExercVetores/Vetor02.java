public class Vetor02 {
    public static void main(String[] args) {
        int n = 5;
        int v[] = new int[n];
        int i;

        for (i=0; i<n; i++){
            v[i] = i;
        }

        for (i=0; i<n; i++){
            System.out.println(v[i]);
        }
    }
}
