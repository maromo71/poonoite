import view.CaixaView;
import view.CaixaView2;

import javax.swing.*;

public class GerenciarCaixa {
    public static void main(String[] args) {
        //CaixaView tela = new CaixaView();
        //tela.setVisible(true);
        JFrame tela2 = new JFrame("Movimento de Caixa");
        tela2.setContentPane(new CaixaView2().getFormCaixa());
        tela2.setSize(350,400);
        tela2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela2.setLocationRelativeTo(null);
        tela2.setVisible(true);
    }
}
