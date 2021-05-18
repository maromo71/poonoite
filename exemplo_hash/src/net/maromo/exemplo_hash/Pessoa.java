package net.maromo.exemplo_hash;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private int idPessoa;
    private String nomePessoa;

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Pessoa) && ((Pessoa) o).idPessoa == this.idPessoa) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.nomePessoa.length();
    }

    @Override
    public int compareTo(Pessoa o) {
        if (this.idPessoa < o.idPessoa) {
            return -1;
        }
        if (this.idPessoa > o.idPessoa) {
            return 1;
        }
        return 0;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Dados da pessoa: \n");
        sb.append("idPessoa=").append(idPessoa);
        sb.append("\nnomePessoa=").append(nomePessoa).append("\n");
        return sb.toString();
    }
}
