public class ClienteTeste {
    public static void main(String[] args) {
        Cliente.taxaCredito = 0.18;
        Cliente cliente = new Cliente();
        cliente.codigo =1;
        cliente.nome = "Joao";
        cliente.limiteCredito = 15000;

        System.out.println();
        Cliente outro = new Cliente();
        outro.codigo =2;
        outro.nome = "Maria";
        outro.limiteCredito = 10000;

        outro = cliente;

        outro.imprimirDados();
        cliente.imprimirDados();


    }

}
