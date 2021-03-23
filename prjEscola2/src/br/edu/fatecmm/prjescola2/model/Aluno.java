package br.edu.fatecmm.prjescola2.model;

public class Aluno {
    private int ra;
    private String nome;
    private String email;
    private String senha;
    private Sexo sexo;



    //1. construtor
    public Aluno() {

    }
    //2. sobrecarga de construtor
    public Aluno(String email, String senha){
        this.email = email;
        this.senha = senha;
        checarLogin(this);
    }

    private void checarLogin(Aluno aluno) {
        if(aluno.email.equals("carlos")){
            this.ra = 123;
            this.nome = "Carlos da Silva";
        }
    }

    //3. sobrecarga de construtor
    public Aluno(int ra, String nome, String email, String senha){
        this(email, senha);
        this.ra = ra;
        this.nome = nome;
    }

    //gerar gets and sets


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
