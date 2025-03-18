package cli;

import model.Tabuleiro;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tabuleiro tabu = new Tabuleiro();
        System.out.println("Digite o primeiro palpite: ");
        int p1 = Integer.parseInt(input.nextLine());
        System.out.println("Digite o segundo palpite: ");
        int p2 = Integer.parseInt(input.nextLine());
        double premio = tabu.jogar(p1, p2);
        if(premio == 0){
            System.out.println("Menos que 3 acertos");
            System.out.println("Infelizmente não foi desta vez");
        }else{
            System.out.println("Total de acertos: " + (premio / 1000));
            System.out.println("Parabéns! Recebeu: " + premio);
        }
    }
}
