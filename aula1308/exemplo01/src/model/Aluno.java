package model;

public class Aluno {
    public int ra;
    public String nome;
    public static String unidade = "Fatec Mogi Mirim";

    public void imprimir(){
        System.out.println("ra = " + ra);
        System.out.println("nome = " + nome);
        System.out.println("unidade = " + unidade);
    }

}
