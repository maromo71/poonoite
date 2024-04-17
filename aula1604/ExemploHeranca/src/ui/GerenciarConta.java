package ui;

import model.Conta;
import model.ContaCorrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarConta {
    List<Conta> lista = new ArrayList<>();

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1,
                "Maromo",
                1000.0);
        Poupanca conta2 = new Poupanca(2,
                "Maromo",
                16);
        GerenciarConta gc = new GerenciarConta();
        gc.lista.add(conta);
        gc.lista.add(conta2);

        for(Conta c : gc.lista){
            System.out.println(c);
        }

    }
}
