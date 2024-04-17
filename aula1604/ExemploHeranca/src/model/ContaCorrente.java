package model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, String nomeCliente, double limite) {
        super(numero, nomeCliente);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= (limite + getSaldo())){
            setSaldo(getSaldo() - valor);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite: " + limite + "\n";
    }

    @Override
    void cobrarTaxa() {
        System.out.println("Taxa de Conta Corrente");
    }
}
