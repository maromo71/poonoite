package br.edu.fatecmm.heranca_conta.model;

public class Corrente extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
                public boolean sacar(double valor) {
        if(valor <= (getSaldo() + limite)){
            setSaldo(getSaldo()- valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.toString());
        dados.append("Limite do cheque: ").append(limite);
        return dados.toString();
    }

    @Override
    void imprimirExtrato() {
//programa do método

    }
}
