package net.maromo.model;

public class Livro {
    private int idLivro;
    private boolean disponivel;
    private String titulo;
    private String autor;

    public Livro(int idLivro, String titulo, String autor) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; //livro disponivel
    }

    public int getIdLivro() {
        return idLivro;
    }
    public void setIdLivro(int idLivro) {
     
        this.idLivro = idLivro;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        String strDisponivel = this.disponivel ? "Disponivel" : "Indisponivel";
        return "Dados do Livro \n" +
                "idLivro=" + idLivro + "\n" +
                "livro disponivel=" + strDisponivel + "\n" +
                "titulo=" + titulo + "\n" +
                "autor=" + autor + "\n";
       
    }
}
