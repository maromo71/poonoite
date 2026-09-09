import java.util.Arrays;

public class Exemplo02 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        //Imprimir esse vetor
        for(int num : vetor){
            System.out.printf("[ %d] ", num);
        }
        //Métodos da Classe Arrays
        Arrays.fill(vetor, 1);
        System.out.println();
        //Imprimir esse vetor
        for(int num : vetor){
            System.out.printf("[ %d] ", num);
        }
    }
}
