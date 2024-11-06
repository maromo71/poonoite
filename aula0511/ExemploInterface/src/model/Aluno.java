package model;

import utils.GerenciarLogin;

import java.util.Objects;

public class Aluno implements Logavel{
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void login() {
        System.out.println("Logou aluno: " + nome);
        GerenciarLogin.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Logout do aluno: " + nome);
        GerenciarLogin.logados.remove(this);
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id == aluno.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
