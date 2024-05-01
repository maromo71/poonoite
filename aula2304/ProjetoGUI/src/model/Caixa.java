package model;

import exceptions.CaixaException;

public class Caixa {
    private double saldo;

    public String depositar(double valor) throws CaixaException {
        if(valor > 0){
            saldo += valor;
            return "Depósito efetuado com sucesso\n";
        }else{
            throw new CaixaException(2);
        }

    }
    public String sacar(double valor) throws CaixaException {
        if(valor <= saldo){
            saldo -= valor;
            return "Saque efetuado com sucesso\n";
        }else{
            throw new CaixaException(1);
        }

    }

    public double getSaldo(){
        return saldo;
    }
}
