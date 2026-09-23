package app;

import model.Carrinho;
import model.Cliente;
import model.ItemCarrinho;
import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCompras {

    private static List<Produto> catalogoProdutos = new ArrayList<>();
    private static Carrinho carrinhoAtivo = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mockarCatalogo();

        int opcao = -1;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite um número inteiro.");
                continue;
            }

            switch (opcao) {
                case 1 -> execIniciarCarrinho();
                case 2 -> execListarCatalogo();
                case 3 -> execAdicionarProduto();
                case 4 -> execConsultarCarrinho();
                case 5 -> execRemoverProduto();
                case 6 -> execFinalizarCompra();
                case 0 -> System.out.println("\nEncerrando a aplicação. Até logo!");
                default -> System.out.println("Opção inexistente!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Mock com String JSON e parser manual via Regex (dispensa libs externas)
    private static void mockarCatalogo() {
        catalogoProdutos.addAll(List.of(
                new Produto(1, "Teclado Mecânico", 249.90),
                new Produto(2, "Mouse Sem Fio", 89.50),
                new Produto(3, "Monitor 24 Pol", 799.00),
                new Produto(4, "Headset Gamer", 189.90),
                new Produto(5, "Webcam Full HD", 149.00)));
    }

    private static void exibirMenu() {
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

    public static void execIniciarCarrinho() {
        System.out.println("\n--- [Novo Carrinho] ---");
        System.out.print("Informe o Nome do cliente: ");
        String nome = scanner.nextLine().trim();

        System.out.print("Informe o CPF: ");
        String cpf = scanner.nextLine().trim();

        System.out.print("Informe o E-mail: ");
        String email = scanner.nextLine().trim();

        Cliente cliente = new Cliente(cpf, nome, email);
        carrinhoAtivo = new Carrinho(cliente);

        System.out.println("Carrinho inicializado com sucesso para: " + cliente);
    }

    public static void execListarCatalogo() {
        System.out.println("\n--- [Catálogo de Produtos] ---");
        for (Produto p : catalogoProdutos) {
            System.out.println(p);
        }
    }

    public static void execAdicionarProduto() {
        if (!validarCarrinhoAtivo())
            return;

        execListarCatalogo();
        System.out.print("\nDigite o ID do produto a incluir: ");
        int idProduto;
        int quantidade;

        try {
            idProduto = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Informe a quantidade: ");
            quantidade = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite apenas valores numéricos.");
            return;
        }

        if (quantidade <= 0) {
            System.out.println("Quantidade deve ser maior que zero.");
            return;
        }

        Produto produtoSelecionado = catalogoProdutos.stream()
                .filter(p -> p.getId() == idProduto)
                .findFirst()
                .orElse(null);

        if (produtoSelecionado == null) {
            System.out.println("Produto com ID " + idProduto + " não encontrado.");
            return;
        }

        carrinhoAtivo.adicionarProduto(produtoSelecionado, quantidade);
        System.out.println("Produto adicionado: " + produtoSelecionado.getNome() + " (x" + quantidade + ")");
    }

    public static void execConsultarCarrinho() {
        if (!validarCarrinhoAtivo())
            return;

        System.out.println("\n================ RESUMO DO CARRINHO ================");
        System.out.println("Cliente: " + carrinhoAtivo.getCliente());
        System.out.println("---------------------------------------------------");

        if (carrinhoAtivo.estaVazio()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (ItemCarrinho item : carrinhoAtivo.getItens()) {
                System.out.println(item);
            }
            System.out.println("---------------------------------------------------");
            System.out.printf("TOTAL GERAL: R$ %.2f\n", carrinhoAtivo.calcularTotal());
        }
        System.out.println("===================================================");
    }

    public static void execRemoverProduto() {
        if (!validarCarrinhoAtivo())
            return;

        if (carrinhoAtivo.estaVazio()) {
            System.out.println("O carrinho já está vazio.");
            return;
        }

        execConsultarCarrinho();
        System.out.print("\nInforme o ID do produto a ser removido: ");
        try {
            int id = Integer.parseInt(scanner.nextLine().trim());
            boolean removido = carrinhoAtivo.removerProduto(id);

            if (removido) {
                System.out.println("Produto removido com sucesso do carrinho.");
            } else {
                System.out.println("Item não localizado no carrinho.");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID inválido.");
        }
    }

    public static void execFinalizarCompra() {
        if (!validarCarrinhoAtivo())
            return;

        if (carrinhoAtivo.estaVazio()) {
            System.out.println("Não é possível finalizar compra com carrinho vazio.");
            return;
        }

        execConsultarCarrinho();
        System.out.printf("\nCompra finalizada com sucesso no valor de R$ %.2f!\n", carrinhoAtivo.calcularTotal());
        System.out.println("Recibo enviado para: " + carrinhoAtivo.getCliente().getEmail());

        // Reseta o carrinho para nova operação
        carrinhoAtivo = null;
    }

    private static boolean validarCarrinhoAtivo() {
        if (carrinhoAtivo == null) {
            System.out.println("Atenção: Nenhum carrinho ativo no momento. Use a opção [1] para iniciar um carrinho.");
            return false;
        }
        return true;
    }
}