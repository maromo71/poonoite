public class Usuario {
    public String nome;
    public String telefone;
    public String email;
    public String usuario;
    public String senha;

    public Usuario(){

    }
    public Usuario(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(String nome, String telefone, String email, String usuario, String senha) {
        this(usuario, senha);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }
}
