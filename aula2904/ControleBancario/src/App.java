import model.Conta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um valor para deposito: ");
            double valor = Double.parseDouble(sc.nextLine());
            conta1.depositar(valor);
            System.out.println("Digite um valor para saque: ");
            valor = Double.parseDouble(sc.nextLine());
            conta1.sacar(valor);
            System.out.println("Saldo da conta: " + conta1.getSaldo());
        }catch (NumberFormatException ex){
            System.out.println("Entrada inválida de dados");
        }catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }


    }
}
