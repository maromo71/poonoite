package model;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String login;
    private String senha;

    //construtor padrao
    public Usuario() {

    }


    //construtor que recebe login e senha
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }


    //construtor personalizado
    public Usuario(int idUsuario, String nome, String login, String senha) {
        this(login, senha);
        this.idUsuario = idUsuario;
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Nome do usuario: " + nome);
    }

    public void imprimir(int x){
        System.out.println("Usuario " + nome + " deve " + x + "prestacoes");
    }
}
