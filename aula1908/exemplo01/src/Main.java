//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Conta.taxaManutencao = 50.00;
       Conta contaDoPaulo = new Conta();
       contaDoPaulo.numero = 1234;
       contaDoPaulo.nomeCliente = "Paulo Lilli";
       contaDoPaulo.saldo = 500.00;


       Conta contaDoMaromo = new Conta();
       contaDoMaromo.numero = 1235;
       contaDoMaromo.nomeCliente = "Maromo";
       contaDoMaromo.saldo = 300.00;

      contaDoPaulo.exibirConta();
       contaDoMaromo.exibirConta();



    }
}