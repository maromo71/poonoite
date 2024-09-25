package model;

public class Poupanca extends Conta {
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
    //implementar os métodos.

    @Override
    public String toString() {
        return super.toString() +
                "Dia do aniversário: " + diaAniversario + "\n";
    }

    @Override
    public void cobrarTarifa() {
        setSaldo(getSaldo() - 0.50);
    }
}
