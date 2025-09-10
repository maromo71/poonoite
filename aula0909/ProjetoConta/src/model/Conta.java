package model;

public class Conta {
    //1. atributos
    private int numero;
    private String nome;
    private double saldo;
    private String agencia;

    //2. construtores
    public Conta(){

    }
    //2.1 Sobrecarga do metodo construtor
    public Conta(int numero, String nome,  String agencia){
        this.numero = numero;
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = 0.0;
    }
    //3. metodos getters and setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    //metodos de negocio (depositar, sacar, imprimirExtrato)
    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        this.saldo += valor;
        return true;
    }
    public boolean sacar(double valor){
        if(valor > saldo){
            return false;
        }
        this.saldo -= valor;
        return true;
    }
    public void imprimirExtrato(){
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-=");
        System.out.println("Extrato da conta: " + this.numero);
        System.out.println("Cliente: " + this.nome);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-=");
    }
}
