import model.Funcionario;
import model.TipoUsuario;
import model.Usuario;

public class GerenciarFuncionarios {

    public static void main(String[] args) {
        //Definir dois usuários
        Usuario usuario1 = new Usuario(1, TipoUsuario.ADMIN);
        Usuario usuario2 = new Usuario(2, TipoUsuario.OPERADOR);
        //Definir um novo funcionario
        Funcionario func = new Funcionario();
        func.setIdFuncionario(1);
        func.setNomeFuncionario("Joaquim Barbosa");
        //Ocorrerei o erro se fosse usuario2 ... Sem permissao
        func.setSalario(2000, usuario1.getTipoUsuario());

        System.out.println(func.getNomeFuncionario());
        System.out.println(func.getSalario(usuario1.getTipoUsuario()));


    }


}
