package view;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaView2 {
    private JPanel formCaixa;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton entradaButton;
    private JButton consultarButton;
    private JButton retiradaButton;
    private JButton sairButton;
    private JTextArea txtMsg;
    private Caixa caixa = new Caixa();
    public JPanel getFormCaixa() {
        return formCaixa;
    }

    public CaixaView2() {

        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(
                        null, "Saindo do programa com cuidado"
                );
            }
        });
        entradaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String mensagem = "";
                double valor = Double.parseDouble(txtValor.getText());
                if(caixa.depositar(valor)){
                    mensagem = "Depositado com sucesso! Valor: " + valor;
                }else{
                    mensagem = "Valor inválido para depósito!";
                }
                txtMsg.append(mensagem + "\n");
                txtSaldo.setText(String.format("%.2f", caixa.getSaldo()));
                txtValor.setText(null);
                txtValor.requestFocus();//colo o foco no controle
            }
        });
    }
}
