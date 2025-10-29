package view;

import exception.CaixaException;
import model.Caixa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Tela
public class CaixaView extends JFrame implements ActionListener {
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdDepositar, cmdRetirar, cmdConsultar, cmdSair;
    private TextArea txtMsg;
    private Dimension dFrame, dLabel, dTextArea, dTextField, dButton;
    private Caixa caixa;
    //Construir a janela personalizada
    public CaixaView() {
        //1. definir aparencia da janela
        apresentarTela();
        //2. definir os componentes da janela
        criarComponentes();
        //3. Instanciar a classe caixa.
        caixa = new Caixa();
    }

    private void criarComponentes() {
        //2.1 definir o padrao de tamanhos
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        //2.2 colocar os elementos na janela
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);

        txtValor = new TextField();
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField();
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        add(txtSaldo);

        cmdDepositar = new Button("Depositar");
        cmdDepositar.setSize(dButton);
        cmdDepositar.setLocation(25,150);
        cmdDepositar.addActionListener(this);
        add(cmdDepositar);

        cmdConsultar = new Button("Consultar");
        cmdConsultar.setSize(dButton);
        cmdConsultar.setLocation(25,185);
        cmdConsultar.addActionListener(this);
        add(cmdConsultar);

        cmdRetirar = new Button("Retirar");
        cmdRetirar.setSize(dButton);
        cmdRetirar.setLocation(225,150);
        cmdRetirar.addActionListener(this);
        add(cmdRetirar);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
        cmdSair.addActionListener(this);
        add(cmdSair);

        txtMsg = new TextArea();
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);

    }

    private void apresentarTela() {
        dFrame = new Dimension(350, 400);
        setTitle("Controle de Caixa");
        setSize(dFrame); //largura e altura
        setDefaultCloseOperation(EXIT_ON_CLOSE); //X fecha o programa
        setLocationRelativeTo(null); // Centralizar
        setLayout(null); //Definir os posicionamentos manuais
        setResizable(false); //Usuario nao vai poder redimensionar
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cmdSair){
            JOptionPane.showMessageDialog(null, "Bye");
            System.exit(0); //sair do programa
        }
        if(e.getSource() == cmdDepositar){
            double valor = Double.parseDouble(txtValor.getText());
            try {
                caixa.depositar(valor);
                txtMsg.append("Depositado com sucesso! Valor: " +valor + "\n");
                txtValor.setText("");
                JOptionPane.showMessageDialog(null,
                        "Operação concluida com sucesso!");
            } catch (CaixaException ex) {
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: " + ex.getMessage(),
                        "Aconteu um erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }

            txtValor.requestFocus(); //coloca o foco no controle
            return;
        }
        if(e.getSource() == cmdRetirar){
            double valor = Double.parseDouble(txtValor.getText());
            try {
                caixa.retirar(valor);
                txtMsg.append("Retirado com sucesso! Valor: " +valor + "\n");
                JOptionPane.showMessageDialog(null,
                        "Saque realizado com sucesso");
            } catch (CaixaException ex) {
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: " + ex.getMessage(),
                        "Aconteceu um erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
            txtValor.requestFocus();
            return;
        }
        if(e.getSource() == cmdConsultar){
            txtSaldo.setText(String.valueOf(caixa.getSaldo()));
            txtMsg.append("Saldo Consultado com sucesso! "
                    + txtSaldo.getText() + "\n");
        }
    }
}
