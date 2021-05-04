package br.edu.fatecmm.controlecaixagui.view;

import br.edu.fatecmm.controlecaixagui.model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaGUI2 {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton cmdEntrada;
    private JButton cmdConsulta;
    private JButton cmdRetirada;
    private JButton cmdSair;
    private JTextArea txtMsg;
    private JLabel lblValor;
    private JLabel lblSaldo;
    private JPanel panelCaixa;

    public JPanel getPanelCaixa() {
        return panelCaixa;
    }

    private Caixa caixa;

    public CaixaGUI2(){
        caixa = new Caixa();

        cmdConsulta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.getSaldo()));
                txtMsg.append("Saldo consultado: " + caixa.getSaldo() + "\n");
                txtValor.setText(null);
                txtValor.requestFocus();
            }
        });
        cmdEntrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                boolean depositou = caixa.depositar(valor);
                if(depositou){
                    txtMsg.append("Depósito efetuado com sucesso \n");
                }else{
                    txtMsg.append("Depósito não efetuado. Valor indevido \n");
                }
                txtValor.setText(null);
                txtValor.requestFocus();
            }
        });
        cmdRetirada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                boolean sacou = caixa.sacar(valor);
                if(sacou){
                    txtMsg.append("Saque efetuado com sucesso \n");
                }else{
                    txtMsg.append("Saldo insuficiente para o saque \n");
                }
                txtValor.setText(null);
                txtValor.requestFocus();
            }
        });
        cmdSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Obrigado por usar o sistema",
                        "Saudação",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
    }
}
