package model;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int qtd){
        this.quantidade += qtd;
    }

    public double getSubTotal(){
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %5d | %6.2f | %6.2f ",
                produto.getNome(), quantidade,
                produto.getPreco(), getSubTotal());
    }
}
