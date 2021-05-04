package br.edu.fatecmm.controlecaixagui;

import br.edu.fatecmm.controlecaixagui.view.CaixaGUI;
import br.edu.fatecmm.controlecaixagui.view.CaixaGUI2;

import javax.swing.*;

public class GerenciarCaixa {

    public static void main(String[] args) {
	// write your code here
       // CaixaGUI tela = new CaixaGUI();
        //tela.setVisible(true);

        //Chamar a nova janela
        JFrame tela = new JFrame();
        tela.setContentPane(new CaixaGUI2().getPanelCaixa());
        tela.setTitle("Controle de Caixa");
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }
}
