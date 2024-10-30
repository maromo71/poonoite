import model.Caixa;
import util.CaixaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciarCaixa {
    private Caixa caixa = new Caixa();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarCaixa gerenciarCaixa = new GerenciarCaixa();

        int opcao = 0;
        do{
            try {
                System.out.println("Menu da Aplicação");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Ver Saldo");
                System.out.println("9. Sair");
                System.out.println("Digite sua opcao: ");
                opcao = sc.nextInt();
                switch (opcao){
                    case 1:
                        gerenciarCaixa.execDepositar();
                        break;
                    case 2:
                        gerenciarCaixa.execSacar();
                        break;
                    case 3:
                        gerenciarCaixa.execSaldo();
                        break;
                    case 9:
                        System.exit(0);
                }
            }catch (NumberFormatException e){
                System.out.println("Erro na Entrada de dados");
            }catch (Exception e){
                System.out.println("Erro: " + e.getMessage());
            }
        }while(opcao != 9);
    }

    private void execSaldo() {
        System.out.println("Saldo em Reais: " + caixa.getSaldo());
    }

    private void execSacar() throws CaixaException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        caixa.sacar(valor);
    }

    private void execDepositar() throws CaixaException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        caixa.depositar(valor);
    }
}
