package app;

import model.Carrinho;
import model.Cliente;
import model.ItemCarrinho;
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
        int opc = -1;
        do {
            gc.exibirMenu();
            System.out.println("Digite a opcao: ");
            opc = Integer.parseInt(gc.scanner.nextLine());
            switch (opc) {
                case 1 -> gc.execIniciarCarrinho();
                case 2 -> gc.execListarCatalogo();
                case 3 -> gc.execAdicionarProduto();
                case 4 -> gc.execConsultarCarrinho();
                case 5 -> gc.execRemoverProduto();
                case 6 -> gc.execFinalizarCompra();
                case 0 -> System.out.println("\nEncerrando a aplicação. Até logo!");
                default -> System.out.println("Opção inexistente!");
            }
        } while (opc != 0);
    }

    private void mockarCatalogo() {
        catalogoProdutos.addAll(List.of(
                new Produto(1, "Teclado Mecânico", 249.90),
                new Produto(2, "Mouse Sem Fio", 89.50),
                new Produto(3, "Monitor 24 Pol", 799.00),
                new Produto(4, "Headset Gamer", 189.90),
                new Produto(5, "Webcam Full HD", 149.00)));
    }

    private void exibirMenu() {
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

    public void execIniciarCarrinho() {
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

    public void execListarCatalogo() {
        System.out.println("\n--- [Catálogo de Produtos] ---");
        for (Produto p : catalogoProdutos) {
            System.out.println(p);
        }
    }

    public void execAdicionarProduto() {
        if (!validarCarrinhoAtivo())
            return;

        execListarCatalogo();
        System.out.print("\nDigite o ID do produto a incluir: ");
        int idProduto = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Informe a quantidade: ");
        int quantidade = Integer.parseInt(scanner.nextLine().trim());
        if (quantidade <= 0) {
            System.out.println("Quantidade deve ser maior que zero.");
            return;
        }
        Produto produtoSelecionado = null;
        for (Produto produto : catalogoProdutos) {
            if (produto.getId() == idProduto) {
                produtoSelecionado = produto;
                break;
            }
        }
        if (produtoSelecionado == null) {
            System.out.println("Produto nao encontrado no catalogo");
            return;
        }
        carrinhoAtivo.adicionarProduto(produtoSelecionado, quantidade);
        System.out.println("Produto adicionado: "
                + produtoSelecionado.getNome() + " (x" + quantidade + ")");
    }

    public void execConsultarCarrinho() {
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

    public void execRemoverProduto() {
        if (!validarCarrinhoAtivo())
            return;

        if (carrinhoAtivo.estaVazio()) {
            System.out.println("O carrinho já está vazio.");
            return;
        }

        execConsultarCarrinho();
        System.out.print("\nInforme o ID do produto a ser removido: ");
        int id = Integer.parseInt(scanner.nextLine().trim());
        boolean removido = carrinhoAtivo.removerProduto(id);
        if (removido) {
            System.out.println("Produto removido com sucesso do carrinho.");
        } else {
            System.out.println("Item não localizado no carrinho.");
        }

    }

    public void execFinalizarCompra() {
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

    private boolean validarCarrinhoAtivo() {
        if (carrinhoAtivo == null) {
            System.out.println("Atenção: Nenhum carrinho ativo no momento. Use a opção [1] para iniciar um carrinho.");
            return false;
        }
        return true;
    }
}
