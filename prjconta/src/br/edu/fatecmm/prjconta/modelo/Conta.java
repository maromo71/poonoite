package br.edu.fatecmm.prjconta.modelo;

/**
 * Comentário de documentação
 * @author Maromo
 * @since 2021 03
 * @version 0.01 beta
 */
public class Conta {
    private int conta;
    private int agencia;
    private double saldo;
    private String nome;

    /**
     * Atributo estátivo cpmf - refere-se ao imposto do cheque
     */
    public static double cpmf = 0.01;

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double getCpmf() {
        return cpmf;
    }

    /**
     *
     * @param valor Valor informado para o saque. Deve ser positivo
     */
    public void sacar(double valor){
        double resultado = valor * cpmf;
        valor+= resultado;
        saldo -= valor;
    }

    /**
     *
     * @return Dados do objeto formato em String
     */
    @Override
    public String toString() {
        return "Conta{" +
                "conta=" + conta +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
