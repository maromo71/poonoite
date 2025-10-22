import view.CaixaView2;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
       // CaixaView tela = new CaixaView();
       // tela.setVisible(true);
        JFrame tela = new JFrame();
        tela.setContentPane(new CaixaView2().getPainelCaixa());
        tela.setSize(350,400);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
