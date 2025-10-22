public class Exemplo {
    public static void main(String[] args) {
        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        int[][] matriz = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf(" %d " , matriz[i][j]);
            }
            System.out.println();
        }
    }
}
