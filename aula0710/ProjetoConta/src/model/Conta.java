package model;

public abstract class Conta {
    private int numero;
    private String nomeCliente;
    protected double saldo;

    abstract void cobrarManutencao();

    public Conta(){

    }
    public Conta(int numero, String nomeCliente){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dados da Conta n.: " + numero + "\n" +
                "Nome: " + nomeCliente + "\n" +
                "Saldo: " + saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
