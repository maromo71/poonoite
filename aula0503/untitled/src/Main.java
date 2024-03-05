import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Digite valor para x");
        x = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do professor");
        String nome = sc.nextLine();
        System.out.println("Digite valor para y");
        y = Integer.parseInt(sc.nextLine());
        System.out.println("x: " + x);
        System.out.println("Nome: " + nome);
        System.out.println("y: " + y);

        String valorX = String.valueOf(x);
        String valorY = Integer.toString(y);

    }
}