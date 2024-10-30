package model;

import util.CaixaException;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) throws CaixaException {
        if(valor <=0) throw new CaixaException("RF27EX02");
        this.saldo += valor;
    }

    public void sacar(double valor) throws CaixaException {
        if(valor > saldo) throw new CaixaException("RF27EX01");
        this.saldo -= valor;
    }

}
