import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarConta {
    private static List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        Poupanca poupanca1 = new Poupanca(123, "Ze", 0.03);
        Poupanca poupanca2 = new Poupanca(234, "Maria", 0.028);
        Corrente corrente1 = new Corrente(1234, "Zeze", 2000.0);
        Corrente corrente2 = new Corrente(2345, "Maria", 5000.0);
        corrente2.cobrarManutencao();
        poupanca1.cobrarManutencao();
        poupanca1.depositar(1000);
        poupanca1.sacar(200);
        corrente1.depositar(500);
        corrente2.depositar(5000);
        adicionarConta(poupanca1);
        adicionarConta(poupanca2);
        adicionarConta(corrente1);
        adicionarConta(corrente2);
        //Mostrar Patrimonio do Banco
        double total = execConsultarPatrimonio();
        System.out.println("Patrimonio depositado: " + total);
        //Exibir a lista de todas as contas
        execListarContas();
    }

    public static double execConsultarPatrimonio() {
        double total = 0.0;
        for(Conta conta : contas) {
            total += conta.getSaldo();
        }
        return total;
    }
    public static void execListarContas(){
        for(Conta conta : contas){
            System.out.println("==============================================");
            System.out.println(conta);
            System.out.println("==============================================");
            System.out.println();
        }
    }
    public static void adicionarConta(Conta conta){
        contas.add(conta);
    }

}
