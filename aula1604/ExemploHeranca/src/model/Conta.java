package model;

public abstract class Conta {
    private int numero;
    private String nomeCliente;
    private double saldo;

    public Conta(int numero, String nomeCliente){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if(valor <= saldo){
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "Dados da Conta\n" +
                "Num. " + numero + "\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Saldo: " + saldo + "\n";
    }

    abstract void cobrarTaxa();
}
