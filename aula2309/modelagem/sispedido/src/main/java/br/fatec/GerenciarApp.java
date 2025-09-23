package br.fatec;

// Arquivo: GerenciarApp.java
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GerenciarApp {

    // Listas para armazenar os dados em memória
    private static List<Cliente> clientes;
    private static List<Produto> produtos;
    private static List<Pedido> pedidos = new ArrayList<>();
    private static long proximoIdPedido = 1;

    public static void main(String[] args) {
        // 1. CARGA INICIAL DE DADOS
        clientes = Utilitarios.carregarClientes();
        produtos = Utilitarios.carregarProdutos();
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("BEM-VINDO AO SISTEMA DE PEDIDOS!");

        do {
            exibirMenuPrincipal();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha

                switch (opcao) {
                    case 1:
                        efetuarPedido(scanner);
                        break;
                    case 2:
                        listarPedidos();
                        break;
                    case 0:
                        System.out.println("Obrigado por utilizar o sistema. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa o buffer do scanner
                opcao = -1; // Garante que o loop continue
            }
        } while (opcao != 0);

        scanner.close();
    }

    // MÉTODOS AUXILIARES (invocados pelo menu)

    private static void exibirMenuPrincipal() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Efetuar Pedido");
        System.out.println("2. Listar Pedidos Efetuados");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void efetuarPedido(Scanner scanner) {
        System.out.println("\n--- EFETUAR NOVO PEDIDO ---");
        
        // Passo 1: Selecionar o cliente
        System.out.println("Selecione o cliente:");
        for (Cliente c : clientes) {
            System.out.println(c.getId() + " - " + c.getNome());
        }
        System.out.print("Digite o ID do cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine();

        Cliente clienteSelecionado = null;
        for (Cliente c : clientes) {
            if (c.getId() == idCliente) {
                clienteSelecionado = c;
                break;
            }
        }

        if (clienteSelecionado == null) {
            System.out.println("Cliente não encontrado. Operação cancelada.");
            return;
        }

        // Passo 2: Criar o pedido e adicionar itens
        Pedido novoPedido = new Pedido(proximoIdPedido++, clienteSelecionado);
        System.out.println("Pedido criado para o cliente: " + clienteSelecionado.getNome());
        
        adicionarItensAoPedido(scanner, novoPedido);
        
        // Passo 3: Adicionar o pedido à lista geral e mostrar resumo
        pedidos.add(novoPedido);
        System.out.println("\nPedido finalizado com sucesso!");
        novoPedido.imprimirResumo();
    }

    private static void adicionarItensAoPedido(Scanner scanner, Pedido pedido) {
        int idProduto = -1;
        while (idProduto != 0) {
            System.out.println("\n--- ADICIONAR ITEM AO PEDIDO ---");
            System.out.println("Lista de produtos disponíveis:");
            for (Produto p : produtos) {
                System.out.println(p);
            }
            System.out.println("---------------------------------");
            System.out.print("Digite o ID do produto para adicionar (ou 0 para finalizar): ");
            
            idProduto = scanner.nextInt();
            scanner.nextLine();

            if (idProduto == 0) {
                break; // Sai do loop para finalizar a adição de itens
            }

            Produto produtoSelecionado = null;
            for (Produto p : produtos) {
                if (p.getId() == idProduto) {
                    produtoSelecionado = p;
                    break;
                }
            }

            if (produtoSelecionado != null) {
                System.out.print("Digite a quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                if (quantidade > 0) {
                    PedidoDetalhe novoItem = new PedidoDetalhe(produtoSelecionado, quantidade);
                    pedido.adicionarItem(novoItem);
                    System.out.println("'" + produtoSelecionado.getDescricao() + "' adicionado ao pedido.");
                } else {
                    System.out.println("Quantidade deve ser maior que zero.");
                }
            } else {
                System.out.println("Produto com ID " + idProduto + " não encontrado.");
            }
        }
    }
    
    private static void listarPedidos() {
        System.out.println("\n--- LISTA DE TODOS OS PEDIDOS ---");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido foi efetuado ainda.");
        } else {
            for (Pedido p : pedidos) {
                p.imprimirResumo();
            }
        }
    }
}