package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixaView extends JFrame implements ActionListener {
    protected Dimension dFrame, dLabel, dTextField, dButton, dTextArea;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextArea txtMsg;
    private Caixa caixa;

    public CaixaView() {
        //Instanciar o objeto caixa
        caixa = new Caixa();
        //Definir altura e largura padrao
        dLabel = new Dimension(40,20);
        dFrame = new Dimension(350,400);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        //Definir a aparencia da janela
        setTitle("Movimento de Caixa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);//sem gerenciador de layout
        setSize(dFrame);//tamanho na janela
        setLocationRelativeTo(null); //centraliza a janela
        setResizable(false); //nao redimensionar a janela
        //Colocar os novos componentes
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        add(cmdEntrada);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(225,150);
        cmdRetirada.addActionListener(this);
        add(cmdRetirada);

        cmdConsulta = new Button("Consultar");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this);
        add(cmdConsulta);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
        cmdSair.addActionListener(this);
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cmdSair){
            String mensagem = "Saindo do programa com cuidado!";
            JOptionPane.showMessageDialog(null, mensagem);
            System.exit(0); //Fechar o programa
        }
        if(e.getSource() == cmdConsulta){
            double saldo = caixa.getSaldo();
            txtSaldo.setText(String.format("%.2f", saldo));
            return;
        }
        if(e.getSource() == cmdEntrada){
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
            return;
        }
        if(e.getSource() == cmdRetirada){
            String mensagem = "";
            double valor = Double.parseDouble(txtValor.getText());
            if(caixa.sacar(valor)){
                mensagem = "Saque com sucesso! Valor: " + valor;
            }else{
                mensagem = "Sem saldo disponível para o saque";
            }
            txtMsg.append(mensagem + "\n");
            txtSaldo.setText(String.format("%.2f", caixa.getSaldo()));
            txtValor.setText(null);
            txtValor.requestFocus();
        }
    }
}
