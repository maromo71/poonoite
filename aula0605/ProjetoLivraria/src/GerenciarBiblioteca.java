import model.Livro;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarBiblioteca {
    private List<Livro> livros = new ArrayList<>();
    private Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        GerenciarBiblioteca gb = new GerenciarBiblioteca();
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar novo livro");
            System.out.println("2. Alterar livro");
            System.out.println("3. Buscar Livro");
            System.out.println("4. Excluir livro");
            System.out.println("5. Total de titulo na biblioteca");
            System.out.println("9. Sair do sistema");
            System.out.println("Digite a opcao: ");
            opcao = Integer.parseInt(gb.leitor.nextLine());
            switch (opcao){
                case 1:
                    gb.execCadastrar();
                    break;
                case 2:
                    System.out.println("Digite o ISBN do livro a alterar");
                    Livro livroAlterar = new Livro();
                    livroAlterar.setISBN(Integer.parseInt(gb.leitor.nextLine()));
                    gb.execAlterar(livroAlterar);
                    break;
                case 3:
                    Livro livroBuscar = new Livro();
                    System.out.println("Digite o ISBN do livro a busca");
                    livroBuscar.setISBN(Integer.parseInt(gb.leitor.nextLine()));
                    gb.execBuscar(livroBuscar);
                    break;
                case 4:
                    Livro livroExcluir = new Livro();
                    System.out.println("Digite o ISBN do livro a exclui");
                    livroExcluir.setISBN(Integer.parseInt(gb.leitor.nextLine()));
                    gb.execExcluir(livroExcluir);
                    break;
                case 5:
                    System.out.println("Total de Livros Registrados: " + gb.getTotalLivros());
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao!=9);
    }

    public void execCadastrar(){
        try {
            System.out.println("Cadastrando Livro");
            System.out.println("Digite o ISBN do Livro (inteiro): ");
            int isbn = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite o título do Livro: ");
            String titulo = leitor.nextLine();
            System.out.println("Digite o ano de publicação do Livro: ");
            int anoPublicacao = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite a quantidade de exemplares do Livro: ");
            int quantidade = Integer.parseInt(leitor.nextLine());
            Livro livro = new Livro(isbn, titulo, anoPublicacao, quantidade);
            //Adicionar na lista
            livros.add(livro);
            System.out.println("Livro cadastrado com sucesso!");
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public void execAlterar(Livro livro){
        try {
            if (livros.contains(livro)) {
                livro = livros.get(livros.indexOf(livro));
                System.out.println("Digite o novo titulo: ");
                livro.setTitulo(leitor.nextLine());
                System.out.println("Digite o novo ano de publicação: ");
                livro.setAnoPublicacao(Integer.parseInt(leitor.nextLine()));
                System.out.println("Digite a nova quantidade: ");
                livro.setQuantidade(Integer.parseInt(leitor.nextLine()));
                System.out.println("Livro alterado com sucesso!");
            } else {
                System.out.println("Livro nao encontrado");
            }
        }catch (RuntimeException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public void execBuscar(Livro livro){
        if(livros.contains(livro)){
            System.out.println(livros.get(livros.indexOf(livro)));
        }else{
            System.out.println("Livro nao encontrado");
        }
    }
    public void execExcluir(Livro livro){
        if(livros.contains(livro)) {
            livros.remove(livro);
            System.out.println("Livro excluido com sucesso");
        }else{
            System.out.println("Livro nao encontrado");
        }
    }
    public int getTotalLivros(){
        return livros.size();
    }
}
