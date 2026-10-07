package model;

import java.time.LocalDate;

public abstract class Conta {
    protected int numero;
    protected String nomeCliente;
    protected LocalDate dataAbertura;
    protected double saldo;

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta(int numero, String nomeCliente){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.dataAbertura = LocalDate.now();
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
        return "Dados da Conta: " + numero + "\n" +
                "Nome Cliente: " + nomeCliente + "\n" +
                "Data Abertura: " + dataAbertura + "\n" +
                "Saldo R$ " + saldo + "\n";
    }
}
