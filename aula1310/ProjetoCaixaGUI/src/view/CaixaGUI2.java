package view;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaGUI2 {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton btnDepositar;
    private JButton btnSacar;
    private JButton btnSaldo;
    private JButton btnSair;
    private JTextArea txtMsg;
    private JPanel panelTotal;
    private JLabel lblValor;
    private JLabel lblSaldo;
    private Caixa caixa = new Caixa();

    public JPanel getPanelTotal() {
        return panelTotal;
    }

    public CaixaGUI2() {
        btnDepositar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                if(caixa.depositar(valor)){
                    txtMsg.append("Deposito efetuado com sucesso\n");
                }else{
                    txtMsg.append("Valor inválido para deposito\n");
                }
            }
        });
        btnSacar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                if(caixa.sacar(valor)){
                    txtMsg.append("Saque efetuado com sucesso\n");
                }else{
                    txtMsg.append("Sem saldo suficiente ou valor inválido\n");
                }
            }
        });
        btnSaldo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.getSaldo()));
                txtMsg.append("Saldo consultado \n");
            }
        });
        btnSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Saindo do programa",
                        "Fim do programa",
                        JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
            }
        });
    }
}
