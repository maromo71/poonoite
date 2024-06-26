package model;

public class Poupanca extends Conta{
    private int diaAniversario;

    public Poupanca(int numero, String nomeCliente, int diaAniversario) {
        super(numero, nomeCliente);
        this.diaAniversario = diaAniversario;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Dia aniversário: " + diaAniversario + "\n";
    }

    @Override
    void cobrarTaxa() {
        System.out.println("Taxa de Poupanca");
    }
}
