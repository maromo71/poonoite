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

    }
    public boolean removerProduto(int idProduto){
        return true;
    }
    public double calcularTotal(){
        return 0.0;
    }
    public boolean estaVazio(){
        return true;
    }

}
