package controller;

import view.CaixaGUI;
import view.CaixaGUI2;

import javax.swing.*;

public class App{

    public static void main(String[] args) {
       // CaixaGUI tela = new CaixaGUI();
       // tela.setVisible(true);
        JFrame tela = new JFrame();
        tela.setContentPane(new CaixaGUI2().getPanelTotal());
        tela.setVisible(true);
        tela.setSize(400,420);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

    }
}
