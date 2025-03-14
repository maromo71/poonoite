import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaTeste gerenciar = new ContaTeste();
        int opcao = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar");
            System.out.println("9. Sair");
            System.out.println("Escolha Opcao: ");
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execDepositar();
                    break;
                case 3:
                    gerenciar.execSacar();
                    break;
                case 4:
                    gerenciar.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }//fecha o switch
        } while (opcao != 9); //fecha o while
    } //fecha o main

    public void execCadastrar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        cc.setConta(input.nextLine());
        System.out.println("Digite o nome da agencia: ");
        cc.setAgencia(input.nextLine());
        System.out.println("Digite o nome da cliente: ");
        cc.setNomeCliente(input.nextLine());
        System.out.println("Conta cadastrada com sucesso!");
    }

    public void execConsultar() {
        cc.imprimir();
    }

    public void execSacar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(input.nextLine());
        int ok = cc.sacar(valor);
        if(ok == 1) {
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Não há saldo suficiente!");
        }
    }

    public void execDepositar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(input.nextLine());
        cc.depositar(valor);
        System.out.println("Depositado com sucesso!");
    }
}
