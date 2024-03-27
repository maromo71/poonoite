import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um valor: ");
            valores[i] = Integer.parseInt(sc.nextLine());
        }
        int soma = 0;
        for(int valor : valores) {
            soma += valor;
        }
        System.out.println("Soma: " + soma);
    }
}