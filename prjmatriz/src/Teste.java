public class Teste {

    public static void main(String[] args) {
        int matriz[][] = new int[7][7];

        for (int i = 0; i < 7; i++) {
            matriz[i][i] = 1;
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("[%2d] ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
