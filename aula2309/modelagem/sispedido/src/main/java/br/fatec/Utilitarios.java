package br.fatec;

// Arquivo: Utilitarios.java
import java.util.ArrayList;
import java.util.List;

public class Utilitarios {

    // Construtor privado para evitar que a classe seja instanciada
    private Utilitarios() {}

    public static List<Cliente> carregarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Ana Silva", "ana.silva@email.com"));
        clientes.add(new Cliente(2, "Bruno Costa", "bruno.c@email.com"));
        clientes.add(new Cliente(3, "Carlos Dias", "carlos.dias@email.com"));
        return clientes;
    }

    public static List<Produto> carregarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(101, "Notebook Gamer", 4500.00));
        produtos.add(new Produto(102, "Mouse sem Fio", 120.50));
        produtos.add(new Produto(103, "Teclado Mecânico RGB", 350.00));
        produtos.add(new Produto(104, "Monitor 27' 4K", 1800.75));
        produtos.add(new Produto(105, "SSD 1TB", 499.90));
        return produtos;
    }
}


