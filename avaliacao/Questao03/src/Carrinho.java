import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private int idCarrinho;
    private LocalDate dataMovimento;
    private List<Produto> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }

    public void removerProduto(Produto produto) {
        itens.remove(produto);
    }
    public void listarProdutosNoCarrinho(){
        System.out.println("Carrinho de compras: " + idCarrinho);
        for (Produto produto : itens) {
            System.out.println(produto);
        }
    }

    public double valorTotalDosProdutos() {
        double total = 0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }
}
