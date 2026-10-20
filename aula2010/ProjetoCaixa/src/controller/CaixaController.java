package controller;

import model.Caixa;

import java.text.NumberFormat;
import java.util.Scanner;

public class CaixaController {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor do deposito: ");
            double valor = Double.parseDouble(sc.nextLine());
            caixa.depositar(valor);
            System.out.println("Digite o valor do saque: ");
            valor = Double.parseDouble(sc.nextLine());
            caixa.sacar(valor);
        } catch (NumberFormatException ex) {
            System.out.println("Entrada invalida de valor.");
        } catch (Exception ex) {
            System.out.println("Aconteceu o erro: " + ex.getMessage());
        }finally {
            System.out.println("Seu saldo eh: " + caixa.getSaldo());
        }
    }
}
