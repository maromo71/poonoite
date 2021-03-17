package br.edu.fatecmm.prjreferencia;

public class Pessoa {
    public int idade;
    public String nome;

    public void alterar(Pessoa obj){
        obj.idade = 33;
        obj.nome = "Maria";
        System.out.println("Objeto: " + obj.hashCode());
        System.out.println("Idade: " + obj.idade);
        System.out.println("Nome: " + obj.nome);
    }
    public static void main(String[] args) {
	    Pessoa p1 = new Pessoa();
	    p1.idade = 24;
	    p1.nome = "Juca";
	    p1.alterar(p1);
        System.out.println(p1.hashCode());
        System.out.println("Idade: " + p1.idade);
        System.out.println("Nome: " + p1.nome);

    }
}
