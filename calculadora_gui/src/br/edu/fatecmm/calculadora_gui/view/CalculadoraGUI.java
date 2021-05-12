package br.edu.fatecmm.calculadora_gui.view;

import br.edu.fatecmm.calculadora_gui.model.Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculadoraGUI {
    private JPanel panelCalculadora;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDividir;
    private JButton btnC;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnVezes;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnMenos;
    private JButton btn0;
    private JButton btnVirg;
    private JButton btnMais;
    private JButton btnIgual;
    private JTextField txtVisor;

    public static float valorPrimeiro;
    public static float valorAtual;
    public static char operacao;

    private Calculadora calc;

    public CalculadoraGUI() {

        calc = new Calculadora();
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String digito="";
                if(e.getSource()==btn0) digito = "0";
                if(e.getSource()==btn1) digito = "1";
                if(e.getSource()==btn2) digito = "2";
                if(e.getSource()==btn3) digito = "3";
                if(e.getSource()==btn4) digito = "4";
                if(e.getSource()==btn5) digito = "5";
                if(e.getSource()==btn6) digito = "6";
                if(e.getSource()==btn7) digito = "7";
                if(e.getSource()==btn8) digito = "8";
                if(e.getSource()==btn9) digito = "9";
                if(e.getSource()==btnVirg){
                    if(!txtVisor.getText().contains(".")){
                        digito = ".";
                    }
                }
                txtVisor.setText(txtVisor.getText() + digito);
            }
        };
        btn7.addActionListener(listener);
        btn8.addActionListener(listener);
        btn9.addActionListener(listener);
        btn4.addActionListener(listener);
        btn5.addActionListener(listener);
        btn6.addActionListener(listener);
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn0.addActionListener(listener);
        btnVirg.addActionListener(listener);
        btnC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                operacao = ' ';
                valorPrimeiro = 0;
                valorAtual = 0;
                txtVisor.setText(null);
            }
        });
        btnVezes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                valorPrimeiro =Float.parseFloat(txtVisor.getText());
                operacao = '*';
                txtVisor.setText(null);
            }
        });
        btnDividir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                valorPrimeiro =Float.parseFloat(txtVisor.getText());
                operacao = '/';
                txtVisor.setText(null);
            }
        });
        btnMenos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                valorPrimeiro =Float.parseFloat(txtVisor.getText());
                operacao = '-';
                txtVisor.setText(null);
            }
        });
        btnMais.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                valorPrimeiro =Float.parseFloat(txtVisor.getText());
                operacao = '+';
                txtVisor.setText(null);
            }
        });
        btnIgual.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                valorAtual = Float.parseFloat(txtVisor.getText());
                if (operacao == ' ') return;
                if (operacao == '+'){
                    txtVisor.setText(Float.toString(calc.somar(valorPrimeiro, valorAtual)));
                }
                if (operacao == '-'){
                    txtVisor.setText(Float.toString(calc.subtrair(valorPrimeiro, valorAtual)));
                }
                if (operacao == '/'){
                    txtVisor.setText(Float.toString(calc.dividir(valorPrimeiro, valorAtual)));
                }
                if (operacao == '*'){
                    txtVisor.setText(Float.toString(calc.multiplicar(valorPrimeiro, valorAtual)));
                }
            }
        });
    }

    public JPanel getPanelCalculadora() {
        return panelCalculadora;
    }
}
