package model;

public class Corrente extends Conta {
    private double limite;

    public Corrente(int numero, String nomeCliente, double limite){
        super(numero, nomeCliente);
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Limite: " + limite;
    }

    @Override
    public void cobrarManutencao() {
        saldo -= 22.00;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (limite + saldo)){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
