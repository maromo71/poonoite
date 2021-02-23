package br.edu.fatecmm.aula2302;

import br.edu.fatecmm.aula2302.model.Aluno;

public class Main {

    public static void main(String[] args) {
	    //Objetos
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João Carlos");
        aluno1.setEmail("emaildojoao@gmail.com");
        aluno1.setLogin("joaocarlos");

        aluno1.efetuarMatricula();

        aluno1.imprimirDados();
    }

}
