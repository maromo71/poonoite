import java.util.Arrays;

public class Exemplo05 {
    public static void main(String[] args) {
        char[][] veia = new char[3][3];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(veia[i], '-');
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[ %c ] ", veia[i][j]);
            }
            System.out.println();
        }
    }



}
