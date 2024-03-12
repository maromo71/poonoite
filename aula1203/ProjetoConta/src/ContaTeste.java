import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        ContaTeste teste = new ContaTeste();
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("9. Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execConsultar();
                    break;
                case 3:
                    teste.execDepositar();
                    break;
                case 4:
                    teste.execSacar();
                    break;
                case 9:
                    System.out.println("FIM do PROGRAMA");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a agencia da conta");
        cc.agencia = scanner.nextLine();
        System.out.println("Digite a o numero da conta");
        cc.conta = scanner.nextLine();
        System.out.println("Digite o nome do cliente");
        cc.nomeCliente = scanner.nextLine();
        System.out.println("Conta cadastrada com sucesso");
    }

    public void execConsultar(){
        cc.imprimir();
    }

    public void execDepositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do depósito");
        double valor = Double.parseDouble(scanner.nextLine());
        cc.depositar(valor);
        System.out.println("Depósito efetuado com sucesso");
    }

    public void execSacar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do saque");
        double valor = Double.parseDouble(scanner.nextLine());
        if(cc.sacar(valor)){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente para o saque");
        }
    }
}
