import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5};
        for (int v : valores) {
            System.out.println(v);
        }
        int[] vetor = new int[20];
        Arrays.fill(vetor, 15);
        for (int item : vetor) {
            System.out.println(item);
        }
        int[] vetor2 = {4, 1, 3, 9, 2, 11};
        List<Integer> lista = new ArrayList<>();
        for(int v : vetor2){
            lista.add(v);
        }
        Collections.sort(lista);
        for(int v : lista){
            System.out.println(v);
        }
    }
}