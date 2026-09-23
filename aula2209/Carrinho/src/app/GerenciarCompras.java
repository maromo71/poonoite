package app;

import model.Carrinho;
import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCompras {
    private List<Produto> catalogoProdutos = new ArrayList<>();
    private Carrinho carrinhoAtivo = null;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciarCompras gc = new GerenciarCompras();
        gc.mockarCatalogo();
        gc.exibirMenu();
    }
    private void mockarCatalogo(){
        catalogoProdutos.addAll(List.of(
                new Produto(1, "Teclado Mecânico", 249.90),
                new Produto(2, "Mouse Sem Fio", 89.50),
                new Produto(3, "Monitor 24 Pol", 799.00),
                new Produto(4, "Headset Gamer", 189.90),
                new Produto(5, "Webcam Full HD", 149.00)));
    }
    private void exibirMenu(){
        System.out.println("\n============= SISTEMA DE COMPRAS =============");
        System.out.println("1. Iniciar Novo Carrinho");
        System.out.println("2. Ver Catálogo de Produtos");
        System.out.println("3. Adicionar Produto ao Carrinho");
        System.out.println("4. Consultar Carrinho");
        System.out.println("5. Remover Produto do Carrinho");
        System.out.println("6. Finalizar Compra");
        System.out.println("0. Sair");
        System.out.println("==============================================");
    }
    public void execIniciarCarrinho(){

    }
    public void execListarCatalogo(){

    }
    public void execAdicionarProduto(){

    }
    public void execConsultarCarrinho(){

    }
    public void execRemoverProduto(){

    }
    public void execFinalizarCompra(){

    }
    private boolean validarCarrinhoAtivo(){
        return true;
    }
}
