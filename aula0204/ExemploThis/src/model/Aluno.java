package model;

public class Aluno {
    private int ra;
    private String nome;
    private String telefone;
    private String login;
    private String senha;
    private Meses mesAniversario;

    //construtor padrão
    public Aluno(){

    }

    public Aluno(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Aluno(int ra, String nome, String telefone, String login, String senha, Meses mesAniversario) {
        this(login, senha);
        this.ra = ra;
        this.nome = nome;
        this.telefone = telefone;
        this.mesAniversario = mesAniversario;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Meses getMesAniversario() {
        return mesAniversario;
    }

    public void setMesAniversario(Meses mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
