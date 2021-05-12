package br.edu.fatecmm.calculadora_gui;

import br.edu.fatecmm.calculadora_gui.view.CalculadoraGUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    JFrame calc = new JFrame();
	    calc.setContentPane(new CalculadoraGUI().getPanelCalculadora());
	    calc.setSize(500, 450);
	    calc.setLocation((1960/2 - 500/2), (1080/2 -450/2));
	    calc.setTitle("Calculadora By Fatec");
	    calc.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    calc.setVisible(true);
    }
}
