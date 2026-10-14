package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CaixaGUI extends JFrame implements ActionListener {
    //atributos da janela
    private JLabel lblValor, lblSaldo;
    private JTextField txtValor, txtSaldo;
    private JButton btnDepositar, btnSacar, btnSaldo, btnSair;
    private JTextArea txtMsg;
    private Dimension dimLabel, dimTextField, dimButton, dimTextArea;
    private Caixa caixa;

    //metodo construtor da janela
    public CaixaGUI(){
        //Instanciar o objeto caixa
        caixa = new Caixa();
        //Definir o tamanho padrao dos elementos
        dimLabel = new Dimension(40,20);
        dimTextField = new Dimension(150,20);
        dimButton = new Dimension(95,20);
        dimTextArea = new Dimension(300, 140);

        //Definir a aparencia da janela
        this.setSize(400, 420);
        this.setTitle("Controle de Caixa"); //titulo da janela
        this.setResizable(false); //nao redimensionar
        this.setLocationRelativeTo(null); //centraliza a janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//fechar o programa
        this.setLayout(null); //nao definido gerenciador de layout - cont manual

        //definir os elementos que vao compor a janela
        lblValor = new JLabel("Valor: ");
        lblValor.setLocation(25,50);
        lblValor.setSize(dimLabel);
        this.add(lblValor);

        lblSaldo = new JLabel("Saldo: ");
        lblSaldo.setLocation(25,80);
        lblSaldo.setSize(dimLabel);
        this.add(lblSaldo);

        txtValor = new JTextField("");
        txtValor.setLocation(75, 50);
        txtValor.setSize(dimTextField);
        this.add(txtValor);

        txtSaldo = new JTextField("");
        txtSaldo.setLocation(75, 80);
        txtSaldo.setSize(dimTextField);
        this.add(txtSaldo);

        btnDepositar = new JButton("Depositar");
        btnDepositar.setLocation(25,150);
        btnDepositar.setSize(dimButton);
        btnDepositar.addActionListener(this);
        this.add(btnDepositar);

        btnSacar = new JButton("Sacar");
        btnSacar.setLocation(180,150);
        btnSacar.setSize(dimButton);
        btnSacar.addActionListener(this);
        this.add(btnSacar);

        btnSaldo = new JButton("Saldo");
        btnSaldo.setLocation(25,185);
        btnSaldo.setSize(dimButton);
        btnSaldo.addActionListener(this);
        this.add(btnSaldo);

        btnSair = new JButton("Sair");
        btnSair.setLocation(180,185);
        btnSair.setSize(dimButton);
        btnSair.addActionListener(this);
        this.add(btnSair);


        txtMsg = new JTextArea("");
        txtMsg.setLocation(25,220);
        txtMsg.setSize(dimTextArea);
        this.add(txtMsg);

    } //fecha o construtor

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSair){
            JOptionPane.showMessageDialog(
                    null,
                    "Saindo do programa",
                    "Fim do programa",
                    JOptionPane.INFORMATION_MESSAGE
            );
            System.exit(0);
        } else if(e.getSource()==btnSaldo){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            txtMsg.append("Saldo consultado \n");
        } else if(e.getSource()==btnDepositar){
            double valor = Double.parseDouble(txtValor.getText());
            if(caixa.depositar(valor)){
                txtMsg.append("Deposito efetuado com sucesso\n");
            }else{
                txtMsg.append("Valor inválido para deposito\n");
            }
        }else if(e.getSource()==btnSacar){
            double valor = Double.parseDouble(txtValor.getText());
            if(caixa.sacar(valor)){
                txtMsg.append("Saque efetuado com sucesso\n");
            }else{
                txtMsg.append("Sem saldo suficiente ou valor inválido\n");
            }
        }
        txtValor.setText("");
        txtValor.requestFocus(); //requer o foco
    }
} //Fecha a classe
