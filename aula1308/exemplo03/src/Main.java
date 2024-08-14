import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Digite valor de a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite valor de b: ");
        b = Integer.parseInt(sc.nextLine());
        int sum = a + b;

        System.out.println("Resultado: " + sum);
    }
}