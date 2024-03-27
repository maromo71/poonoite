public class Conta {
    private int numero;
    private String cliente;
    private double saldo;

    public Conta(){

    }
    public Conta(int numero, String cliente){
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Dados da conta: \n" +
                "Núm. " + numero + "\n" +
                "Cliente: " + cliente + "\n" +
                "Saldo Atual: " + saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException(
                    "Valor invalido"
            );
        }
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor > saldo){
            throw new IllegalArgumentException(
                    "Saldo insuficiente para saque"
            );
        }
        saldo -= valor;
    }
}
