package model;

import exception.CaixaException;

public class Caixa {
    private double saldo;

    public Caixa(){
        //explicito
        saldo = 0.0;
    }
    public void depositar(double valor) throws CaixaException {
        if(valor <=0) throw new CaixaException("RF01EX02");
        saldo+= valor;
    }

    public void retirar(double valor) throws CaixaException {
        if(valor> saldo) throw new CaixaException("RF01EX01");
        saldo -= valor;
    }

    public double getSaldo() {

        return saldo;
    }
}
