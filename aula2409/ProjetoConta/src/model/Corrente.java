package model;

public class Corrente extends Conta{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //implementar métodos

    @Override
    public void sacar(double valor) {
        if(valor <= (getSaldo() + limite)){
            setSaldo(getSaldo() - valor);
        }else{
            throw new IllegalArgumentException(
                    "Sem saldo para saque"
            );
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite R$: " + limite + "\n";
    }

    @Override
    public void cobrarTarifa() {
        setSaldo(getSaldo() - 2.0);
    }
}
