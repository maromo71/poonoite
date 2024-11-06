package model;


import org.jetbrains.annotations.NotNull;

public class Aluno {
    private int ra;
    private String nome;

    public Aluno() {

    }
    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        return ((o instanceof Aluno) && ra == ((Aluno) o).ra);
    }

    @Override
    public int hashCode() {
        //logica de espalhamento
        return nome.length();
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int compareTo(@NotNull Aluno o) {
        return Integer.compare(ra, o.ra);
    }
}
