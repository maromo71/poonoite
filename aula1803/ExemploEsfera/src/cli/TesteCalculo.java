package cli;


import model.Esfera;

import java.util.Scanner;

public class TesteCalculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Esfera esfera = new Esfera();
        System.out.println("Digite o valor do raio da esfera: ");
        esfera.setRaio(Double.parseDouble(input.nextLine()));
        System.out.println("Valor do volume da esfera: " + esfera.getVolume());
    }
}
