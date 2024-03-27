import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarContas {
    List<Conta> contas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        GerenciarContas gc = new GerenciarContas();
        do{
            System.out.println("Menu do Programa");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Consultar Todas as Contas");
            System.out.println("3. Consultar uma Conta");
            System.out.println("4. Depositar em uma Conta");
            System.out.println("5. Sacar de uma Conta");
            System.out.println("6. Saldo de Todas as Conta");
            System.out.println("9. Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(gc.scanner.nextLine());
            switch (opcao){
                case 1:
                    gc.execCadastrar();
                    break;
                case 2:
                    gc.execConsultarTodas();
                    break;
                case 3:
                    gc.execConsultar();
                    break;
                case 4:
                    gc.execDepositar();
                    break;
                case 5:
                    gc.execSacar();
                    break;
                case 6:
                    gc.execMostrarSaldoTotal();
                    break;
                case 9:
                    System.out.println("Acabou");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao != 9);
    }

    public void execCadastrar(){
        int numero;
        String nomeCliente;
        System.out.println("Digite o numero da conta");
        numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o nome do cliente");
        nomeCliente = scanner.nextLine();
        Conta conta = new Conta(numero, nomeCliente);
        contas.add(conta); //acabou de adicionar na lista
        System.out.println("Conta cadastrada com sucesso");
    }
    public void execConsultarTodas(){
        for(Conta conta : contas){
            System.out.println(conta);
        }
    }
    public void execConsultar(){
        System.out.println("Digite a conta a consultar: ");
        int numeroConsulta = Integer.parseInt(scanner.nextLine());
        Conta conta = procurarConta(numeroConsulta);
        if(conta!=null){
            System.out.println(conta);
        }

    }

    private Conta procurarConta(int numeroConsulta) {
        for(Conta conta : contas){
            if(numeroConsulta == conta.getNumero()){
                return conta;
            }
        }
        return null;
    }

    public void execDepositar(){
        System.out.println("Digite a conta a depositar: ");
        int numeroConsulta = Integer.parseInt(scanner.nextLine());
        Conta conta = procurarConta(numeroConsulta);
        if(conta!=null){
            //pedir o valor do deposito
            double valor;
            System.out.println("Digite o valor do deposito: ");
            valor = Double.parseDouble(scanner.nextLine());
            conta.depositar(valor);
            System.out.println("Depósito efetuado com sucesso");
        }
    }
    public void execSacar(){
        System.out.println("Digite a conta a sacar: ");
        int numeroConsulta = Integer.parseInt(scanner.nextLine());
        Conta conta = procurarConta(numeroConsulta);
        if(conta!=null){
            //pedir o valor do deposito
            double valor;
            System.out.println("Digite o valor do saque: ");
            valor = Double.parseDouble(scanner.nextLine());
            conta.sacar(valor);
            System.out.println("Saque efetuado com sucesso");
        }
    }
    public void execMostrarSaldoTotal(){
        double total = 0.0;
        for(Conta conta : contas){
            total += conta.getSaldo();
        }
        System.out.println("Total de Saldo nas Contas: " + total);
    }
}