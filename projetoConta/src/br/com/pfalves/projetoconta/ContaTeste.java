package br.com.pfalves.projetoconta;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaTeste contaTeste = new ContaTeste();
        int opcao;
        do{
            System.out.println("Menu Principal....");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar");
            System.out.println("9.. Sair");
            System.out.println("Escolha sua opcao: ");
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao){
                case 1:
                    contaTeste.execCadastrar();
                    break;
                case 2:
                    contaTeste.execDepositar();
                    break;
                case 3:
                    contaTeste.execSacar();
                    break;
                case 4:
                    contaTeste.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim...");
                    break;
                default:
                    System.out.println("Opcao inválida");
            }
        }while(opcao!=9);
    }

    public void execCadastrar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        cc.setNumConta(input.nextLine());
        System.out.println("Digite a agencia");
        cc.setAgencia(input.nextLine());
        System.out.println("Digite o nome do Cliente");
        cc.setNomeCliente(input.nextLine());
        System.out.println("Cadastro efetuado com sucesso ");

    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        Scanner input = new Scanner(System.in);
        double valor;
        System.out.println("Digite o valor da saque: ");
        valor = Double.parseDouble(input.nextLine());
        int retorno = cc.sacar(valor);
        if(retorno==1){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Veja o extrato");
        }else{
            System.out.println("Você não possui saldo");
        }
    }
    public void execDepositar(){
        Scanner input = new Scanner(System.in);
        double valor;
        System.out.println("Digite o valor da depósito: ");
        valor = Double.parseDouble(input.nextLine());
        cc.depositar(valor);
    }
}
