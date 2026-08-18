public class Conta {
    //Atributos
    public int numConta;
    public String nomeCliente;
    public double saldo;
    public static double taxaMov = 0.0010; //0.10%

    //Metodos
    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        double imposto = valor * taxaMov;
        saldo -= valor + imposto;
    }

    public void emitirSaldo(){
        System.out.println("----------------------------");
        System.out.println("Conta n. " + numConta);
        System.out.println("Saldo atual em R$ " + saldo);
        System.out.println("----------------------------");
    }

}
