package br.edu.fatecmm.heranca_conta.model;

public class Poupanca extends Conta {
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.toString());
        dados.append("Dia de Aniversário: ").append(diaAniversario);
        return dados.toString();
    }

    @Override
    void imprimirExtrato() {
//método próprio para imprimir
    }

}
