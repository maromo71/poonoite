package br.edu.fatecmm.prjesfera;

import br.edu.fatecmm.prjesfera.model.Esfera;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo do Volume de uma Esfera");
        System.out.println("Digite o valor do Raio: ");
        double raio = Double.parseDouble(sc.nextLine());
        Esfera esfera = new Esfera(raio);
        System.out.println("Volume é: " + esfera.getVolume());
    }
}
