import model.Conta;

import java.util.Scanner;

public class ContaTeste {
    //atributo (variável de instância)
    public Conta cc = new Conta();
    public Scanner leitor =new Scanner(System.in);

    public static void main(String[] args) {
        ContaTeste teste = new ContaTeste();

        int opc = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Consultar");
            System.out.println("4. Sacar");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(teste.leitor.nextLine());
            switch(opc){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execDepositar();
                    break;
                case 3:
                    teste.execConsultar();
                    break;
                case 4:
                    teste.execSacar();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc!=9);
    }
    public void execCadastrar(){
        System.out.println("Digite a agencia: ");
        cc.agencia = leitor.nextLine();
        System.out.println("Digite a conta: ");
        cc.conta = leitor.nextLine();
        System.out.println("Digite o nome: ");
        cc.nomeCliente = leitor.nextLine();
        System.out.println("Conta criada com sucesso!");
    }

    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        double valor;
        System.out.println("Digite o valor do saque: ");
        valor = Double.parseDouble(leitor.nextLine());
        if(cc.sacar(valor)){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Sem saldo suficiente para saque!");
        }
    }
    public void execDepositar(){
        double valor;
        System.out.println("Digite o valor do deposito: ");
        valor = Double.parseDouble(leitor.nextLine());
        cc.depositar(valor);
        System.out.println("Depositado com sucesso!");
    }
}
