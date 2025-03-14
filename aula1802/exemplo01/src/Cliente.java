public class Cliente {
    //Atributos
    public int codigo;
    public String nome;
    public double limiteCredito;
    public static double taxaCredito = 0.15;

    //Métodos
    public void imprimirDados(){
        System.out.println("Dados do cliente: ");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Limite de Credito: " + limiteCredito);
        System.out.println("Taxa de Credito: " + taxaCredito);
    }
}
