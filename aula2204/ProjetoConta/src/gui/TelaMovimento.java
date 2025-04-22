package gui;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class TelaMovimento extends JFrame implements ActionListener {
    protected Dimension dLabel, dFrame, dTextField, dButton, dTextArea;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextArea txtMsg;
    private Caixa caixa;

    //construtor personalizado da janela
    public TelaMovimento(){
        //instaciar o caixa
        caixa = new Caixa();
        //Definir a aparencia da janela
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300, 140);
        //Aparencia da propria janela
        setSize(dFrame);
        setTitle("Controle de Caixa");
        setLocationRelativeTo(null); //centraliza a janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); //x fecha tambem o programa
        setLayout(null); //definiremos posicionamento manualmente
        //Definindo a aparencia dos controles que irao na janela
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor); //adicionar a janela

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
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Depositar");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        add(cmdEntrada);

        cmdRetirada = new Button("Sacar");
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
        cmdSair.setLocation(225, 185);
        cmdConsulta.addActionListener(this);
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        add(txtMsg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdEntrada){
            //Far o rotina do depositar
            double valor = Double.parseDouble(txtValor.getText());
            caixa.depositar(valor);
            LocalDateTime momento = LocalDateTime.now();
            txtMsg.append("Depósito efetuado com sucesso. ");
            txtMsg.append("Data/Hora: " + momento + "\n");
            txtValor.setText(null);
            txtValor.requestFocus(); //coloca o foco no elemento
            return;
        }
        if(e.getSource()==cmdRetirada){
            //Faz a rotina do sacar
            double valor = Double.parseDouble(txtValor.getText());
            caixa.sacar(valor);
            LocalDateTime momento = LocalDateTime.now();
            txtMsg.append("Saque efetuado com sucesso. ");
            txtMsg.append("Data/Hora: " + momento + "\n");
            txtValor.setText(null);
            txtValor.requestFocus(); //coloca o foco no elemento
            return;
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            return;
        }
        if(e.getSource()==cmdSair){
            System.exit(0); //encerra o programa
        }
    }
}
