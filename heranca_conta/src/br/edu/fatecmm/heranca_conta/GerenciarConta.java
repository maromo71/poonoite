package br.edu.fatecmm.heranca_conta;

import br.edu.fatecmm.heranca_conta.model.Conta;
import br.edu.fatecmm.heranca_conta.model.Corrente;
import br.edu.fatecmm.heranca_conta.model.Poupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarConta {

    public List<Conta> listaDeContas = new ArrayList<Conta>();

    public static void main(String[] args) {
	    GerenciarConta gc = new GerenciarConta();
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("\n\nSistema de Contas");
            System.out.println("1.. Cadastrar um Conta");
            System.out.println("2.. Depositar em uma Conta");
            System.out.println("3.. Sacar de uma Conta");
            System.out.println("4.. Exibir saldo de uma Conta");
            System.out.println("5.. Listar Contas Abertas");
            System.out.println("6.. Patrimônio Líquido do Banco");
            System.out.println("9.. Sair");
            System.out.println("Escolha sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    gc.cadastrarConta();
                    break;
                case 2:
                    gc.execDepositar();
                    break;
                case 3:
                    gc.execSacar();
                    break;
                case 4:
                    gc.execExibirSaldo();
                    break;
                case 5:
                    gc.listarContas();
                    break;
                case 6:
                    gc.exibirPatrimonio();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }while(opc != 9);
    }

    private void exibirPatrimonio() {
        double total = 0;
        for (Conta x: listaDeContas ) {
            total += x.getSaldo();
        }
        System.out.println("Valor total depositado por todos os clientes");
        System.out.println("R$ " + total);
    }

    private void listarContas() {
        for (Conta x: listaDeContas) {
            System.out.println(x.toString());
            System.out.println("---------------------------------");
        }
    }

    private void execExibirSaldo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta que deseja saber o saldo: ");
        int contaProc = Integer.parseInt(sc.nextLine());
        for (Conta x: listaDeContas) {
            if(x.getNumConta() == contaProc) {
                System.out.println("Saldo: " + x.getSaldo());
                return;
            }
        }
        System.out.println("Conta não encontrada");
    }

    private void execSacar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta que deseja sacar: ");
        int contaProc = Integer.parseInt(sc.nextLine());
        for (Conta x: listaDeContas) {
            if(x.getNumConta() == contaProc){
                System.out.println("Digite o valor do saque: ");
                double valorSaque = Double.parseDouble(sc.nextLine());
                if(x.sacar(valorSaque)){
                    System.out.println("Saque efetuado com sucesso");
                }else{
                    System.out.println("Não possui saldo suficiente");
                }
                return;
            }
        }
        System.out.println("Não existe a conta informada..");
    }

    private void execDepositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta que deseja depositar: ");
        int contaProc = Integer.parseInt(sc.nextLine());
        for (Conta x: listaDeContas) {
            if(x.getNumConta() == contaProc){
                System.out.println("Digite o valor do depósito: ");
                double valorDeposito = Double.parseDouble(sc.nextLine());
                if(x.depositar(valorDeposito)){
                    System.out.println("Depósito efetuado com sucesso");
                }else{
                    System.out.println("Valor inválido para depósito");
                }
                return;
            }
        }
        System.out.println("Não existe a conta informada..");
    }

    public void cadastrarConta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de Conta que vai cadastrar");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Poupança");
        System.out.println("Escolha o tipo: ");
        int tipo = Integer.parseInt(sc.nextLine());
        Conta x;
        if(tipo == 1){
            x = new Corrente();
        }else{
            x = new Poupanca();
        }
        System.out.println("Digite o número da conta: ");
        x.setNumConta(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do cliente: ");
        x.setNomeCliente(sc.nextLine());
        if(tipo == 1){
            System.out.println("Digite o Limite do cheque especial");
            Corrente aux = (Corrente) x;
            aux.setLimite(Double.parseDouble(sc.nextLine()));
        }else{
            System.out.println("Digite o dia de aniversário: ");
            Poupanca aux = (Poupanca) x;
            aux.setDiaAniversario(Integer.parseInt(sc.nextLine()));
        }
        System.out.println("Cadastrado com sucesso");
        listaDeContas.add(x);

    }
}
