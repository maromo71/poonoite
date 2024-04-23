package model;

public class Caixa {
    private double saldo;

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return;
        }
        System.out.println("Valor inválido");
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return;
        }
        System.out.println("Saldo insuficiente");
    }

    public double getSaldo(){
        return saldo;
    }
}
