package model;

public class Poupanca extends Conta {
    private double taxaJuros;

    public Poupanca(int numero, String nomeCliente, double taxaJuros) {
        super(numero, nomeCliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void cobrarManutencao() {
        saldo -= 15.00;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Taxa de Juros: " + taxaJuros;
    }
}
