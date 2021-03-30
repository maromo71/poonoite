package br.edu.fatecmm.prjloterica;

import br.edu.fatecmm.prjloterica.model.Tabuleiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o palpite 1: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o palpite 2: ");
        int b = Integer.parseInt(sc.nextLine());
        Tabuleiro tabuleiro = new Tabuleiro();
        double premio = tabuleiro.jogar(a, b);
        System.out.println("Seu premio: " + premio);
    }
}
