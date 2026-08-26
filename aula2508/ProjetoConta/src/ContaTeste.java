import java.util.Scanner;

public class ContaTeste {
    private Conta cc = new Conta();
    private Scanner sc = new Scanner(System.in);
    //loop para as opcoes para o usuario
    public static void main(String[] args) {
        //pulo do gato. Preciso de um objeto desta
        //classe para gerenciar as transacoes
        //no caso: depositar, sacar....
        ContaTeste gerenciar = new ContaTeste();
        int opcao=0;
        do{
            System.out.println("Menu de Operacoes");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar");
            System.out.println("9. Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(gerenciar.sc.nextLine());
            switch (opcao){
                case 1-> gerenciar.execCadastrar();
                case 2-> gerenciar.execDepositar();
                case 3-> gerenciar.execSacar();
                case 4->gerenciar.execConsultar();
                case 9-> System.out.println("Fim do programa");
                default -> System.out.println("opcao invalida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        System.out.println("Digite o numero da conta: ");
        cc.setConta(sc.nextLine());
        System.out.println("Digite a agencia da conta: ");
        cc.setAgencia(sc.nextLine());
        System.out.println("Digite o nome do cliente: ");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Conta cadastrada com sucesso..");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        System.out.println("Digite o valor do saque: ");
        double valorDoSaque = Double.parseDouble(sc.nextLine());
        if(cc.sacar(valorDoSaque)){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente");
        }
    }
    public void execDepositar(){
        System.out.println("Digite o valor de deposito: ");
        double valorDeposito = Double.parseDouble(sc.nextLine());
        cc.depositar(valorDeposito);
        System.out.println("Deposito efetuado com sucesso..");
    }
}
