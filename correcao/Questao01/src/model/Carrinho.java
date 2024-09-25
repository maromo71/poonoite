package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrinho {
    private int idCarrinho;
    private Date dataMovimento;
    private List<Produto> itens = new ArrayList<>();


    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }
    public void listarProdutos(){
        for (Produto produto : itens) {
            System.out.println("Id Produto: " + produto.getIdProduto());
            System.out.println("Nome Produto: " + produto.getNomeProduto());
            System.out.println("Preço do Produto: " + produto.getPreco());

            System.out.println();
        }
    }
}
