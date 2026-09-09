import java.util.Scanner;

public class Exmeplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = Double.parseDouble(sc.nextLine());

        double res = Math.PI * Math.pow(raio, 2.0);
        System.out.println("Area: " + res);
    }
}
