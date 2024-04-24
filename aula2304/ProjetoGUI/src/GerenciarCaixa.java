import gui.TelaMovimento;
import gui.TelaMovimento2;

import javax.swing.*;

public class GerenciarCaixa {
    public static void main(String[] args) {
        //TelaMovimento tela = new TelaMovimento();
        //tela.setVisible(true);

        JFrame novaTela = new JFrame("Controle de Caixa");
        novaTela.setContentPane(new TelaMovimento2().getPainelCaixa());
        novaTela.setVisible(true);
        novaTela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        novaTela.setLocationRelativeTo(null);
    }
}
