import model.Carrinho;
import model.Produto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciarProduto {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<Produto>();
        Produto p = new Produto();
        p.setIdProduto(1);
        p.setNomeProduto("Coca cola");
        p.setPreco(12.89);
        p.setAtivo(true);
        p.setPrincipalForncedor("Coca cola");
        lista.add(p);
        Produto p2 = new Produto();
        p2.setIdProduto(2);
        p2.setNomeProduto("Fanta");
        p2.setPreco(15.00);
        p2.setAtivo(true);
        p2.setPrincipalForncedor("Coca cola cia");
        lista.add(p2);


        Carrinho c = new Carrinho();
        c.setIdCarrinho(1);
        c.setDataMovimento(Date.from(Instant.now()));
        c.setItens(lista);

        c.listarProdutos();

    }


}
