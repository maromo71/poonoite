import model.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarConta {
    private List<Conta> contas = new ArrayList<>();
    private Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciarConta gc = new GerenciarConta();
        int opcao = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Depositar na Conta");
            System.out.println("3 - Sacar de Conta");
            System.out.println("4 - Extrato de uma conta");
            System.out.println("5 - Extrato de todas as contas");
            System.out.println("9 - Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(gc.ler.nextLine());
            switch (opcao) {
                case 1 -> gc.execCadastrar();
                case 2 -> gc.execDepositar();
                case 3 -> gc.execSacar();
                case 4 -> gc.execConsultar();
                case 5 -> gc.execListarTodas();
                case 9 -> System.exit(0);
                default -> System.out.println("Opcao invalida");
            }
        } while (opcao != 9);
    }

    private void execListarTodas() {
        for (Conta conta : this.contas) {
            conta.imprimirExtrato();
            System.out.println();
        }
    }

    public void execCadastrar() {
        //Cadastrar uma nova conta e coloca-la na lista
        System.out.println("Digite o numero da conta: ");
        int numero = Integer.parseInt(ler.nextLine());
        System.out.println("Digite o nome do cliente: ");
        String nome = ler.nextLine();
        System.out.println("Digite a agencia da conta: ");
        String agencia = ler.nextLine();
        Conta conta = new Conta(numero, nome, agencia);
        contas.add(conta); //adicionada na lista de contas
        System.out.println("Cadastrado com sucesso!");
        System.out.println("Total de contas no momento: " + contas.size());
    }

    public void execDepositar() {
        int numero;
        System.out.println("Digite o numero da conta a depositar: ");
        numero = Integer.parseInt(ler.nextLine());
        Conta conta = getConta(numero);
        if(conta == null) {
            System.out.println("Conta nao cadastrada!");
            return;
        }
        System.out.println("Digite o valor do deposito: ");
        double deposito = Double.parseDouble(ler.nextLine());
        if(conta.depositar(deposito)) {
            System.out.println("Depositado com sucesso!");
        }else{
            System.out.println("Valor invalido para deposito");
        }
    }

    public void execSacar() {
        int numero;
        System.out.println("Digite o numero da conta a sacar: ");
        numero = Integer.parseInt(ler.nextLine());
        Conta conta = getConta(numero);
        if(conta == null) {
            System.out.println("Conta nao cadastrada!");
            return;
        }
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(ler.nextLine());
        if(conta.sacar(valor)) {
            System.out.println("Saque com sucesso!");
        }else{
            System.out.println("Sem saldo suficiente!");
        }

    }

    public void execConsultar() {
        int numero;
        System.out.println("Digite o numero da conta a consultar: ");
        numero = Integer.parseInt(ler.nextLine());
        Conta conta = getConta(numero);
        if (conta == null) {
            System.out.println("Conta nao cadastrada!");
            return;
        }
        conta.imprimirExtrato();
    }

    public Conta getConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}
