package model;

public class Caixa {
    private double saldo;

    public Caixa(){
        //explicito
        saldo = 0.0;
    }
    public void depositar(double valor){
        saldo+= valor;
    }

    public void retirar(double valor){
        if(valor <=saldo){
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
