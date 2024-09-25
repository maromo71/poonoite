package model;

public abstract class Conta {
    private int numero;
    private String nomeCliente;
    private double saldo;

    //getters and setters
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
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }else{
            throw new IllegalArgumentException(
                    "Sem saldo para saque"
            );
        }
    }

    @Override
    public String toString() {
        return "Dados da conta: " + numero + "\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Saldo R$: " + saldo + "\n";
    }

    //Método abstratato para cobrarTarifa
    public abstract void cobrarTarifa();
}
