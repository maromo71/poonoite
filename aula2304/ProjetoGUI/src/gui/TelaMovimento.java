package gui;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMovimento extends JFrame implements ActionListener {
    private TextField txtValor, txtSaldo;
    private Label lblValor, lblSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;
    private Dimension dFrame, dTextField, dTextArea, dButton, dLabel;
    private Caixa caixa;

    //método construtor
    public TelaMovimento(){
        //Instaciar um objeto do tipo Caixa
        caixa = new Caixa();

        //tamanhos padrões
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        //aparência da janela
        setTitle("Controle de Caixa");
        setSize(dFrame);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //novos componentes
        lblValor = new Label("Valor:");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
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

        cmdConsulta = new Button("Consulta");
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
        if(e.getSource()==cmdEntrada){
            double valor = Double.parseDouble(txtValor.getText());
            caixa.depositar(valor);
            txtMsg.append("Depósito de " + valor + " efetuado \n");
            txtValor.setText(null);
            txtValor.requestFocus(); //colocar o foco no controle
            return;
        }
        if(e.getSource()==cmdRetirada){
            double valor = Double.parseDouble(txtValor.getText());
            caixa.sacar(valor);
            txtMsg.append("Saque de " + valor + " efetuado \n");
            txtValor.setText(null);
            txtValor.requestFocus(); //colocar o foco no controle
            return;
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            txtMsg.append("Saldo consultado R$ " + txtSaldo.getText());
            txtMsg.append("\n");
            return;
        }
        if(e.getSource()==cmdSair){
            JOptionPane.showMessageDialog(
                    null,
                    "Fechado o programa",
                    "Saindo",
                    JOptionPane.INFORMATION_MESSAGE
            );
            System.exit(0); //fechar o programa
        }
    }
}
