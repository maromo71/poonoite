package br.edu.fatec.sispedido;

public class PedidoDetalhe {
    private Produto produto;
    private int quantidade;
    private double precoUnitario; // Preco no momento da compra

    public PedidoDetalhe(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco(); // Garante o preco daquele instante
    }

    public double getSubtotal(){
        return this.quantidade * this.precoUnitario;
    }

    // Getters
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public String toString() {
        return String.format("    - Produto: %s | Qtd: %d | Preço Unit.: R$ %.2f | Subtotal: R$ %.2f",
            produto.getDescricao(), quantidade, getSubtotal());
    }

    
}
