package br.edu.fatecmm.prjaluno.model;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private double premio;

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public void imprimir(){
        System.out.println("Dados da Apólice");
        System.out.println("Nome do segurado = " + nomeSegurado);
        System.out.println("Idade = " + idade);
        System.out.println("Valor do Prêmio = " + premio);
        System.out.println();
    }


}
