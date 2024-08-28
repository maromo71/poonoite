import java.util.Arrays;

public class Exemplo {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Arrays.fill(vetor, 15);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        int[] vetor2 = new int[10];
        System.out.println();
        System.arraycopy(vetor, 0, vetor2, 7, 3);
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }
    }
}
