import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarContas {
    private List<Conta> contas = new ArrayList<>(); //Lista de contas

    public static void main(String[] args) {
        GerenciarContas gc = new GerenciarContas();
        //Criando duas contas correntes e uma poupanca
        Corrente conta1 = new Corrente();
        conta1.setNumero(1);
        conta1.setNomeCliente("Maromo");
        conta1.setLimite(2000.0);

        Corrente conta2 = new Corrente();
        conta2.setNumero(2);
        conta2.setNomeCliente("Chica da Silva");
        conta2.setLimite(3000.0);

        Poupanca conta3 = new Poupanca();
        conta3.setNumero(3);
        conta3.setNomeCliente("Maria");
        conta3.setDiaAniversario(5);

        //Deposito em duas contas (conta1 e a conta3)
        conta1.depositar(1000.0);
        conta3.depositar(5000.0);

        //Sacar da conta 3.
        conta3.sacar(4000.0);
        //Sacar da conta1 (corrente)
        conta1.sacar(1500.0);

        conta1.cobrarTarifa();

        conta3.cobrarTarifa();

        //Adicionar as tres contas na lista de contas
        gc.adicionarConta(conta1);
        gc.adicionarConta(conta2);
        gc.adicionarConta(conta3);

        //Exibir todas as contas
        gc.exibirContas();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void exibirContas(){
        for(Conta conta : contas){
            System.out.println(conta);
        }
    }
}
