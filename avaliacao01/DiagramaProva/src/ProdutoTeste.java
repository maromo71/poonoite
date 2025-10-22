import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//3.1 Exemplo de Classe
public class ProdutoTeste {
    //encapsulado
    private List<Produto> listaProdutos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    //3.3 atributo estático
    private static int proximoCodigo = 0;

    //3.1 teste é um objeto da classe ProdutoTeste
    public static void main(String[] args) {
        ProdutoTeste teste = new ProdutoTeste();

    }
    //Questao 2 da prova
    public Produto buscarProdutoPorCodigo(int codigo){
        for(Produto prod: listaProdutos){
            if(prod.getCodigo() == codigo){
                return prod;
            }
        }
        return null;
    }


    //Questao 4 da prova
    public void execListarTodos(){
        for(Produto p: listaProdutos){
            System.out.println("------------------------");
            System.out.println("Codigo: " + p.getCodigo());
            System.out.println("Nome: " + p.getNome());
        }
    }
}
