public class Conta {
    //atributos
    public int numero;
    public String nomeCliente;
    public double saldo;
    public static double taxaManutencao = 12.80;



    //métodos
    public void exibirConta(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("Saldo: " + this.saldo);
    }
}
