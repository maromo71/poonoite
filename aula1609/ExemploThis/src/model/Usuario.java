package model;

public class Usuario {
    //Atributos
    private int matricula;
    private String nome;
    private String email;
    private String usuario;
    private String senha;

    //Construtores
    public Usuario(){

    }
    public Usuario(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    public Usuario(int matricula, String nome, String email,
                   String usuario, String senha){
        this(usuario, senha);
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
