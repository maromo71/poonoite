package br.com.maromo;

public class Gerenciar {

    public static void main(String[] args) {
	    //Definir os objetos
        //Matricular a paula e o oscar
        Aluno paula = new Aluno();
        Aluno oscar = new Aluno();

        paula.ra = 123;
        paula.nome = "Paula Silva Souza";
        paula.email = "emaildapaula@gmail.com";

        oscar.ra = 234;
        oscar.nome = "Oscar Santos";
        oscar.email = "emaildooscar@gmail.com";

        paula.efetuarMatricula();

        oscar.efetuarMatricula();

        oscar.cancelarMatricula();

    }
}
