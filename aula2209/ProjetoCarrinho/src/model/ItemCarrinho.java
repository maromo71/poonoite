package model;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int qtd) {
        this.quantidade += qtd;
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("%-18s | Qtd: %2d | Unit: R$ %7.2f | Subtotal: R$ %8.2f",
                produto.getNome(), quantidade, produto.getPreco(), getSubtotal());
    }
}
