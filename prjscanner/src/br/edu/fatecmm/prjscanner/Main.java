package br.edu.fatecmm.prjscanner;


import java.util.Scanner;

//Classe Main

public class Main {

    /*
    coloca o comentario de mais de uma
    linha
    coloca o comentario.....

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    double peso, altura, imc;
        System.out.println("Digite o valor do peso da pessoa: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.println("Digite o valor da altura da pessoa: ");
        altura = Double.parseDouble(input.nextLine());
        imc = peso / (altura * altura);
        System.out.printf("Imc da pessoa: %3.2f \n", imc);
    }
}
