import model.Computador;
import model.Usuario;

public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.setNomeComputador("IBM");
        computador1.setIdComputador(1);
        computador1.setValor(5000);
        computador1.setQtdMemoria(128);
        //listar os dados
        computador1.listarDados();

        //Usuario
        Usuario usuario1 = new Usuario();
        usuario1.setNomeUsuario("Joao");
        usuario1.setIdUsuario(1);
        usuario1.setNivel(1);

        //atualizar o preco
        boolean atualizou = computador1.atualizarPreco(8000, usuario1);
        if(atualizou){
            System.out.println("Preco Atualizado");
        }else{
            System.out.println("Preco nao atualizado");
        }

        computador1.listarDados();
    }
}
