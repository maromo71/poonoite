import java.util.ArrayList;

public class Pedido {
    public String cliente;
    public ArrayList<String> produtos;
    public double total;

    public Pedido(String cliente){
        this.cliente = cliente;
        produtos = new ArrayList<>();
        total = 0;
    }

    public void adicionarProduto(String nomeProduto, double preco){
        produtos.add(nomeProduto);
        total += preco;
    }

    public void removerProduto(String nomeProduto, double preco){
        produtos.remove(nomeProduto);
        total -= preco;
    }

    public void mostarPedido(){
        System.out.println("Cliente: " + cliente);
        System.out.println("Produtos: " + produtos);
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        Pedido p = new Pedido("Maria");
        p.adicionarProduto("Camiseta", 50.0);
        p.adicionarProduto("Calça", 120.00);
        p.removerProduto("Camiseta", 50.0);
        p.mostarPedido();
    }
}


//A
//O correto deveria ser um ArrayList de Produtos. Implememtar
//uma classe nos moldes do exercicio 03. (Questão 03)
//Esta adocao resolveria os problemas no codigo acima, de
//forma mais segura e robusta.


//B
//Ao proteger colocando os atributos como privados e implementando
//os modificadores de acesso (getters e setters) o codigo acima
//funcionaria de forma mais adequada. Facilitaria a manutencao
//do codigo e evitaria problemas futuros. Por exemplo, ao
//encapsular uma logica de negocios estamos protegendo ela de
//alteracoes externas.


//C
//O correto seria adicionar um objeto do tipo Produto e ao
//remover este objeto teriamos a consistencia de que o valor
//a ser subtraido seria o que esta no item do pedido, e nao
//o informado externamente.
//public void removerProduto(Produto p){
// produtos.remove(p);
// total -= p.getPreco();
// }