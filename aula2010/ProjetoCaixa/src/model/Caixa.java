package model;

import exception.CaixaException;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws CaixaException {
       if(valor <= saldo){
           saldo -= valor;
           return;
       }
       throw new CaixaException("RF01EX02");
    }

    public void depositar(double valor) throws CaixaException {
        if(valor > 0){
            saldo += valor;
            return;
        }
        throw new CaixaException("RF01EX01");

    }
}
