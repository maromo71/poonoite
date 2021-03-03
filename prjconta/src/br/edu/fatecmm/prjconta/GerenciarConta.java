package br.edu.fatecmm.prjconta;

import br.edu.fatecmm.prjconta.modelo.Conta;

public class GerenciarConta {

    public static void main(String[] args) {

        //Qual é o cpmf do dia
        System.out.println("CPMF ATUAL: " + Conta.getCpmf());

        Conta conta1 = new Conta();
        //nao se deve acessar atributo estático pelo objeto e sim pela classe
        conta1.cpmf = 0.02;
        conta1.setConta(1);
        conta1.setAgencia(123);
        conta1.setSaldo(1000.0);
        conta1.sacar(100.0);
        conta1.setNome("Antonio");

        System.out.println(conta1);
        System.out.println();

        Conta conta2 = new Conta();
        conta2.setConta(2);
        conta2.setAgencia(234);
        conta2.setSaldo(2000.0);
        conta2.setNome("Maria");
        conta2.sacar(100.0);
        System.out.println(conta2);

    }
}
