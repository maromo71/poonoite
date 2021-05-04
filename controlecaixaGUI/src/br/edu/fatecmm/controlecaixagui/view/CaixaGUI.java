package br.edu.fatecmm.controlecaixagui.view;

import br.edu.fatecmm.controlecaixagui.model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CaixaGUI extends JFrame implements WindowListener, ActionListener {
    private Dimension dFrame, dTextField, dTextArea, dLabel, dButton;
    private Label lblValor;
    private Label lblSaldo;
    private TextField txtValor;
    private TextField txtSaldo;
    private Button cmdEntrada;
    private Button cmdRetirada;
    private Button cmdConsulta;
    private Button cmdSair;
    private TextArea txtMsg;
    //Atributo Associado da Classe Caixa
    private Caixa caixa;

    public CaixaGUI(){
        //Instanciar o objeto caixa
        caixa = new Caixa();
        //Definir a aparencia e o comportamento da nossa janela
        dFrame = new Dimension(400, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTextArea =new Dimension(300, 140);
        //Janela
        this.setSize(dFrame);
        this.setTitle("Controle de Caixa");
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //Rótulos
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        this.add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        this.add(lblSaldo);

        //TextField
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        this.add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        this.add(txtSaldo);

        //Botões
        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        cmdEntrada.addActionListener(this);
        this.add(cmdEntrada);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180, 150);
        cmdRetirada.addActionListener(this);
        this.add(cmdRetirada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        cmdConsulta.addActionListener(this);
        this.add(cmdConsulta);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        cmdSair.addActionListener(this);
        this.add(cmdSair);

        //TextArea
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        this.add(txtMsg);
        this.addWindowListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null,
                "Obrigado por usar o sistema",
                "Saudação",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSair){
            JOptionPane.showMessageDialog(null,
                    "Obrigado por usar o sistema",
                    "Saudação",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            txtMsg.append("Saldo consultado: " + caixa.getSaldo() + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
        if(e.getSource()==cmdEntrada){
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
        if(e.getSource()==cmdRetirada){
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
    }
}
