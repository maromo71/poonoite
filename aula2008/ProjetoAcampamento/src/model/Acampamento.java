package model;

public class Acampamento {
    // atributos
    public String nome;
    public char equipe;
    public int idade;

    //métodos
    public void imprimir(){
        System.out.println("Nome   = " + nome);
        System.out.println("Equipe = " + equipe);
        System.out.println("Idade  = " + idade);
        System.out.println();
    }

    public void separarGrupo(){
        if(idade <= 5){
            equipe = '-';
            return;
        }
        if(idade <=10){
            equipe = 'A';
            return;
        }
        if(idade <= 20){
            equipe = 'B';
            return;
        }
        equipe = 'C';
    }
}
