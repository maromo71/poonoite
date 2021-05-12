package br.edu.fatecmm.calculadora_gui;

import br.edu.fatecmm.calculadora_gui.model.Cliente;
import br.edu.fatecmm.calculadora_gui.util.ExemploTryException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        /*try{
            int a, b;
            System.out.println("Digite um valor para a: ");
            a = sc.nextInt();
            System.out.println("Digite um valor para b: ");
            b = sc.nextInt();

            int c = a / b;
            System.out.println("Divisão inteira: " + c);
        }catch (NumberFormatException e){
            System.out.println("Entrada de dado inválida. Espera-se um número inteiro");
        }catch(ArithmeticException e1){
            System.out.println("Impossível dividir número inteiro por ZERO");
        }catch(Exception e2){
            System.out.println("Por favor, aconteceu um erro. Informe o código ao Adm do sistema");
            System.out.println("Tipo da mensagem: " + e2.toString());
        }finally {
            System.out.println("Passei aqui");
        }*/

        int codigoCliente;
        Cliente c = new Cliente();
        System.out.println("Digite o codigo do cliente: ");
        try {
            c.setCodigo(Integer.parseInt(sc.nextLine()));
        } catch (ExemploTryException e) {
            System.out.println(e.getMessage());
        }
    }
}
