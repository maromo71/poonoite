import exception.ProdutoException;
import model.Produto;

import javax.swing.*;

public class AppProdutos {

    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Bombom", 2.50);
        Produto produto2 = new Produto(2, "Bala", 1.0);
        System.out.println(produto1);
        System.out.println(produto2);
        try{
            produto1.registrarEntrada(100);
            produto1.registrarSaida(30);
            produto2.registrarEntrada(100);
            produto2.registrarSaida(199);

        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Erro: " + e.getMessage(),
                    "Erro ocorrido",
                    JOptionPane.ERROR_MESSAGE);
        }
        System.out.println(produto1);
        System.out.println(produto2);
    }
}
