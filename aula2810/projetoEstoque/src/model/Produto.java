package model;

import exception.ProdutoException;

public class Produto {
    private int codigo;
    private String descricao;
    private double quantidade;
    private double preco;

    public Produto(int codigo, String descricao, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = 0;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void registrarEntrada(int qtd) throws ProdutoException {
        if(qtd <=0) throw new ProdutoException("RF01EX02");
        this.quantidade += qtd;
    }

    public void registrarSaida(int qtd) throws ProdutoException {
        if(qtd>this.quantidade) throw new ProdutoException("RF01EX01");
        this.quantidade -= qtd;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
