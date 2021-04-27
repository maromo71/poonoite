package br.edu.fatecmm.heranca_conta.model;

public abstract class Conta {
    //Atributos da classe conta
    private int numConta;
    private String nomeCliente;
    private double saldo;

    //Gerar os gets and sets
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
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

    //método sacar e o método depositar
    public boolean depositar(double valor){
        if(valor>0){
            saldo+= valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if(valor > saldo){
            return false;
        }
        saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Dados da conta do cliente");
        dados.append("Num Conta: ").append(numConta);
        dados.append("Nome Cliente: ").append(nomeCliente);
        dados.append("Saldo: ").append(saldo);
        return dados.toString();
    }

    //Método abstrato
    abstract void imprimirExtrato(); //Regra forte. Toda conta tem que ter este método (implementação)
}
