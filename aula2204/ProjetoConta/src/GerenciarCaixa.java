import gui.Tela;
import gui.TelaMovimento;

import javax.swing.*;

public class GerenciarCaixa {
    public static void main(String[] args) {
        //TelaMovimento tela = new TelaMovimento();
        //tela.setVisible(true);
        JFrame minhaTela = new JFrame();
        minhaTela.setContentPane(new Tela().getFormCaixa());
        minhaTela.setSize(350,400);
        minhaTela.setTitle("Controle de Caixa");
        minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        minhaTela.setLocationRelativeTo(null);
        minhaTela.setVisible(true);
    }
}
