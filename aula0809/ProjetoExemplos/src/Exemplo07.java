public class Exemplo07 {

    public static void alterarValor(Pessoa p){
        p.nome = "Oscar";
        p.idade = 21;
    }
    public static void main(String[] args) {
        Pessoa x = new Pessoa("Maria", 24);
        Pessoa y = new Pessoa();
        y.nome = "Ze";
        x.imprimir();
        alterarValor(x);
        x.imprimir();
        System.out.printf("%d", 23);
    }
}
