import model.Tabuleiro;

import java.util.Scanner;

public class GerenciarJogo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro palpite: ");
        int p1 = Integer.parseInt(ler.nextLine());
        System.out.println("Digite o segundo palpite: ");
        int p2 = Integer.parseInt(ler.nextLine());
        Tabuleiro tabu = new Tabuleiro();
        double valor = tabu.jogar(p1, p2);
        if (valor > 0){
            System.out.println("Parabéns! seu premio: " + valor);
        }else{
            System.out.println("Que pena. Tente de novo");
        }
    }
}
