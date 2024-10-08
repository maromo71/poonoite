package net.maromo;

import net.maromo.model.Aluno;
import net.maromo.model.ControleEmprestimo;
import net.maromo.model.Livro;
import net.maromo.model.Professor;

public class GerenciarBiblioteca {
    public static void main(String[] args) {
        //Instanciar dois livros, e dois usuarios diferentes
        Livro livro1 = new Livro(1, "Harry Potter", "J.K. Rowling");
        Livro livro2 = new Livro(2, "Lord of the Rings", "J.R.R. Tolkien");
        
        Professor professor = new Professor(1, "Joao Pedro", "bCk0w@example.com", "Engenharia de Software", "Mestre");
        Aluno aluno = new Aluno(1, "Maria Clara", "k5IYz@example.com", "123456", "Engenharia de Software");

        //Emprestar o livro1 para o professor
        String resposta = ControleEmprestimo.registraEmprestimo(1, professor, livro1);
        System.out.println(resposta);
        System.out.println();

        //Empresar o livro2 para o aluno
        resposta = ControleEmprestimo.registraEmprestimo(2, aluno, livro2);
        System.out.println(resposta);
        System.out.println();
        
        //Devolver o livro1 para o professor
        resposta = ControleEmprestimo.registraDevolucao(1, professor, livro1);
        System.out.println(resposta);
        System.out.println();

        //Devolver o livro2 para o aluno
        resposta = ControleEmprestimo.registraDevolucao(2, aluno, livro2);
        System.out.println(resposta);
        System.out.println();
    }
}