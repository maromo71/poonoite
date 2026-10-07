package controller;

import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<Conta> contas = new ArrayList<>();


    public static void menu(){
        System.out.println("Menu de Operações");
        System.out.println("1. Cadastrar Conta");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Patrimonio do Banco ");
        System.out.println("5. Num. de Contas Abertas");
        System.out.println("9. Sair");
        System.out.println("Digite sua opcao: ");
    }

    public double getPatrimonioBanco(){
        double total = 0;
        for(Conta c : contas){
            total += c.getSaldo();
        }
        return total;
    }

    public void listarNumeroContasAbertas(){
        int totalGeral = contas.size();
        int totalCorrente = 0;
        int totalPoupanca = 0;
        for(Conta c : contas){
            if(c.getClass().toString().equals("class model.Corrente")){
                totalCorrente++;
            }else{
                totalPoupanca++;
            }
        }
        System.out.println("Numero total de contas abertas: " + totalGeral);
        System.out.println("Contas Corrente: " + totalCorrente);
        System.out.println("Poupanca: " + totalPoupanca);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var aplicativo = new App();
        int opcao = 0;
        do{
            menu();
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> aplicativo.execCadastrar();
                case 2 -> aplicativo.execDepositar();
                case 3 -> aplicativo.execSacar();
                case 4 -> aplicativo.execExibirPatrimonio();
                case 5 -> aplicativo.execExibirNumeroContas();
                case 9 -> System.out.println("Sair do Programa");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao!=9);

    }

    private  void execExibirNumeroContas() {
        listarNumeroContasAbertas();
    }

    private  void execExibirPatrimonio() {
        double total = getPatrimonioBanco();
        System.out.println("Patrimonio total do Banco R$ " + total);
    }

    public Conta getConta(int numero){
        Conta conta = null;
        for(Conta c : contas){
            if(c.getNumero()==numero){
                conta = c;
                break;
            }
        }
        return conta;
    }
    private  void execSacar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta a sacar: ");
        int numero = Integer.parseInt(sc.nextLine());
        Conta conta = getConta(numero);
        if(conta==null){
            System.out.println("Conta inexistente");
            return;
        }
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        if(conta.sacar(valor)){
            System.out.println("Saque efetuado com com sucesso");
        }else{
            System.out.println("Sem saldo ou limite");
        }
    }

    private  void execDepositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta a depositar: ");
        int numero = Integer.parseInt(sc.nextLine());
        Conta conta = getConta(numero);
        if(conta==null){
            System.out.println("Conta inexistente");
            return;
        }
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        if(conta.depositar(valor)){
            System.out.println("Valor depositado com sucesso");
        }else{
            System.out.println("Valor inválido para o deposito");
        }

    }

    private  void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para Corrente ou 2 para Poupanca: ");
        int tipoConta = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o numero da conta: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        Conta conta;
        if(tipoConta == 1){
            System.out.println("Digite o limite da conta: ");
            double limite = Double.parseDouble(sc.nextLine());
            conta = new Corrente(numero, nomeCliente, limite);
        }else{
            System.out.println("Digite a taxa de rendimento: ");
            double taxa = Double.parseDouble(sc.nextLine());
            conta = new Poupanca(numero, nomeCliente, taxa);
        }
        contas.add(conta);
    }


}
