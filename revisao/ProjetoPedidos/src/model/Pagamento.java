package model;

public class Pagamento {
    private double valor;
    private String metodo;

    public Pagamento(double valor, String metodo) {
        this.valor = valor;
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Pagamento: R$" + valor + " via " + metodo;
    }
}
