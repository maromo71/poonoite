package net.maromo.model;
import java.time.LocalDate;
public class ControleEmprestimo {

    public static String registraEmprestimo(int idEmprestimo,Usuario usuario, Livro livro) {
        if(!livro.isDisponivel()) return "Livro Indisponivel";
        livro.setDisponivel(false); //indica que o livro foi emprestado
        RegistroEmprestimo emprestimo = new RegistroEmprestimo(idEmprestimo, usuario, livro);
        StringBuilder sb = new StringBuilder();
        sb.append("Emprestimo realizado para o Usuario: " + usuario.getNome() + "\n");
        sb.append("Livro: " + livro.getTitulo() + "\n");
        sb.append("Data de Emprestimo: " + emprestimo.getDataEmprestimo() + "\n");
        return sb.toString();
    }  

    public static String registraDevolucao(int idEmprestimo,Usuario usuario, Livro livro) {
        livro.setDisponivel(true); //indica que o livro foi devolvido
        RegistroEmprestimo emprestimo = new RegistroEmprestimo(idEmprestimo, usuario, livro);
        emprestimo.setDataDevolucao(LocalDate.now());
        StringBuilder sb = new StringBuilder();
        sb.append("Devolução realizada para o Usuario: " + usuario.getNome() + "\n");
        sb.append("Livro: " + livro.getTitulo() + "\n");
        sb.append("Data de Devolução: " + emprestimo.getDataDevolucao() + "\n");
        sb.append("Data de Emprestimo: " + emprestimo.getDataEmprestimo() + "\n");
        return sb.toString();
    }
       
}
