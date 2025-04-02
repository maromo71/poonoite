public class ContaCorrente {
    private int numConta;
    private String nomeCliente;
    private double saldo;
    public static double taxaJuros = 0.034;

    //No exemplo acima numConta, nomeCliente,
    //saldo são atributos não estáticos, ou seja
    //pertercem ao objeto do tipo ContaCorrente.
    //Já taxaJuros pertence ao tipo ContaCorrente e
    //não ao objeto ContaCorrente.
    //Para criar um atributo estático,
    //basta
    //utilizar a palavra-chave static.

    //Para acessar usamos o nome da Classe.Atributo, ex:
    //ContaCorrente.taxaJuros
}

