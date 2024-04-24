package gui;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaMovimento2 {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton cmdEntrada;
    private JButton cmdRetirada;
    private JButton cmdConsulta;
    private JButton cmdSair;
    private JTextArea txtMsg;
    private JLabel lblValor;
    private JLabel lblSaldo;
    private JPanel painelCaixa;

    public JPanel getPainelCaixa() {
        return painelCaixa;
    }

    private Caixa caixa;

    public TelaMovimento2(){

        caixa = new Caixa();

        cmdEntrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.depositar(valor);
                txtMsg.append("Depósito de " + valor + " efetuado \n");
                txtValor.setText(null);
                txtValor.requestFocus(); //colocar o foco no controle
            }
        });
        cmdRetirada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.sacar(valor);
                txtMsg.append("Saque de " + valor + " efetuado \n");
                txtValor.setText(null);
                txtValor.requestFocus(); //colocar o foco no controle

            }
        });
        cmdConsulta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.getSaldo()));
                txtMsg.append("Saldo consultado R$ " + txtSaldo.getText());
                txtMsg.append("\n");

            }
        });
        cmdSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Fechado o programa",
                        "Saindo",
                        JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
            }
        });
    }
}
