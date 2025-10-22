package view;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class CaixaView2 {
    private JPanel painelCaixa;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton cmdDepositar;
    private JButton cmdConsultar;
    private JButton cmdRetirar;
    private JButton cmdSair;
    private JTextArea txtMsg;
    private JLabel lblValor;
    private JLabel lblSaldo;

    public JPanel getPainelCaixa() {
        return painelCaixa;
    }

    private Caixa caixa;

    public CaixaView2(){
        caixa = new Caixa();

        cmdSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Bye");
                System.exit(0);
            }
        });
        cmdDepositar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.depositar(valor);

                txtMsg.append("Depositado com sucesso! Valor: " +valor + "\n");
                txtValor.setText("");
                JOptionPane.showMessageDialog(null,
                        "Operação concluida com sucesso!");
                txtValor.requestFocus();
            }
        });

        cmdConsultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(String.valueOf(caixa.getSaldo()));
                txtMsg.append("Saldo Consultado com sucesso! "
                        + txtSaldo.getText() + "\n");
            }
        });
        cmdRetirar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.retirar(valor);
                txtMsg.append("Retirado com sucesso! Valor: " +valor + "\n");
                JOptionPane.showMessageDialog(null,
                        "Saque realizado com sucesso");
                txtValor.requestFocus();
            }
        });
    }
}
