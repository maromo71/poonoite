import model.Usuario;

public class Teste {
    public static void main(String[] args) {
        Usuario usu = new Usuario();
        usu.setMatricula(12);
        usu.setNome("Juca");
        usu.setEmail("e@e.com");
        usu.setUsuario("admin");
        usu.setSenha("123456");
        Usuario usu2 = new Usuario(22,
                "Maria",
                "maria@gmail.com",
                "operador", "234");

    }
}
