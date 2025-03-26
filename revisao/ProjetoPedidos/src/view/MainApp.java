package view;

// VIEW - Classe Principal com Menu

import model.Cliente;
import model.Pagamento;
import model.Pedido;
import model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;
    private ArrayList<Pedido> pedidos;
    private Scanner scanner;

    public MainApp() {
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.executarMenu();
    }

    public void executarMenu() {
        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Criar Pedido");
            System.out.println("4. Listar Pedidos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarProduto();
                    break;
                case 3:
                    criarPedido();
                    break;
                case 4:
                    listarPedidos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    public void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        clientes.add(new Cliente(nome, email, telefone));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void cadastrarProduto() {
        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em Estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        produtos.add(new Produto(nome, preco, quantidade));
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void criarPedido() {
        if (clientes.isEmpty() || produtos.isEmpty()) {
            System.out.println("Cadastre pelo menos um cliente e um produto antes de criar um pedido.");
            return;
        }

        System.out.println("\nEscolha um Cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }
        int indiceCliente = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir quebra de linha
        Cliente cliente = clientes.get(indiceCliente);

        Pedido pedido = new Pedido(cliente);
        System.out.println("Adicione produtos ao pedido:");

        while (true) {
            System.out.println("\nEscolha um Produto:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + ". " + produtos.get(i));
            }
            int indiceProduto = scanner.nextInt() - 1;
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            pedido.adicionarProduto(produtos.get(indiceProduto), quantidade);

            System.out.print("Adicionar mais produtos? (s/n): ");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) break;
        }

        System.out.print("Forma de Pagamento (Cartão/Boleto/Pix): ");
        String metodo = scanner.nextLine();
        Pagamento pagamento = new Pagamento(pedido.calcularTotal(), metodo);
        pedido.setPagamento(pagamento);

        pedidos.add(pedido);
        System.out.println("Pedido criado com sucesso!");
    }

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }
}
