package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private Cliente cliente;
    private List<ItemCarrinho> itens;

    public Carrinho(Cliente cliente){
        this.cliente = cliente;
        itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void adicionarProduto(Produto produto, int quantidade){
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getId() == produto.getId()) {
                item.adicionarQuantidade(quantidade);
                return;
            }
        }
        itens.add(new ItemCarrinho(produto, quantidade));
    }
    public boolean removerProduto(int idProduto){
        return itens.removeIf(
                item -> item.getProduto().getId() == idProduto);
    }
    public double calcularTotal(){
        double total = 0.0;
        for(ItemCarrinho item : itens){
            total+= item.getSubTotal();
        }
        return total;
    }
    public boolean estaVazio(){
        return itens.isEmpty();
    }

}
