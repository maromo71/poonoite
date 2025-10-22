import java.util.Arrays;

public class Exemplo1 {
    public static void main(String[] args) {
        int[] vetor = {3, 3, 5};
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        int [] vetor2 = new int[15];
        Arrays.fill(vetor2, 30);
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }
    }
}
