import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Exemplo1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        Random gerador = new Random();
        for(int i = 0; i < vetor.length; i++){
            vetor[i]=gerador.nextInt(101);
        }
        //imprimir o vetor
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Pos: %d = %d \n", i, vetor[i]);
        }
        //imprimir o vetor de outra forma
        Arrays.sort(vetor);

        for(int x : vetor){
            System.out.println(x);
        }
    }
}
