package br.edu.fatecmm.aula2302.model;

public class Aluno {
    //Atributos - propriedades
    private String nome;
    private String email;
    private String login;
    private String senha;

    public Aluno(){
        this.senha = "123456";
    }

    //Construção mágica
    //<ALT> + <INSERT>


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

    //Métodos - efetuar sua matrícula
    public void efetuarMatricula(){
        System.out.println("Matricula efetuada");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

    public void imprimirDados(){
        System.out.println("nome = " + nome);
        System.out.println("email = " + email);
        System.out.println("login = " + login);
        System.out.println("senha = " + senha);
    }



}
