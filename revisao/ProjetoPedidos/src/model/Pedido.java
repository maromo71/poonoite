package model;

import java.util.ArrayList;

public class Pedido {
    private static int contador = 1;
    private int numero;
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private Pagamento pagamento;

    public Pedido(Cliente cliente) {
        this.numero = contador++;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.getQuantidade() >= quantidade) {
            for (int i = 0; i < quantidade; i++) {
                this.produtos.add(produto);
            }
            produto.reduzirEstoque(quantidade);
        } else {
            System.out.println("Estoque insuficiente para " + produto.getNome());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Pedido #" + numero + " | Cliente: " + cliente.getNome() + " | Total: R$" + calcularTotal();
    }

}
