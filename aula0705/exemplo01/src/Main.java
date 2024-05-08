import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        Produto p1 = new Produto(5, "Coca", 10.5);
        Produto p2 = new Produto(1, "Fanta", 8.4);
        Produto p3 = new Produto(18, "Skol", 6.80);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        Collections.sort(lista);

        System.out.println("Lista Ordenada");
        for(Produto p : lista) System.out.println(p);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Codigo do produto a procurar: ");
        int cod = Integer.parseInt(sc.nextLine());
        Produto produtoProc = new Produto();
        produtoProc.setId(cod);
        if(lista.contains(produtoProc)){
            System.out.println("Tem o produto na lista");
            int indice = lista.indexOf(produtoProc);
            produtoProc = lista.get(indice);
            System.out.println(produtoProc.getDescricao());
            System.out.println(produtoProc.getValor());
            lista.remove(produtoProc);
            System.out.println("Produto Removido da lista");
            for(Produto prod : lista){
                System.out.println(prod);
            }
        }else{
            System.out.println("Produto nao encontrado");
        }

    }
}