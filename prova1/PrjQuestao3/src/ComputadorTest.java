import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputadorTest {
    public static void main(String[] args) {
        List<Computador> listaComp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Computador comp = new Computador();
            System.out.println("Digite o id do comp: ");
            comp.setIdComputador(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite o nome do comp:");
            comp.setNomeComputador(sc.nextLine());
            System.out.println("Digite a qtd de Mem: ");
            comp.setQtdMemoria(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite o valor: ");
            comp.setValor(Double.parseDouble(sc.nextLine()));
            listaComp.add(comp);
        }
        Usuario usuario = new Usuario();
        usuario.setNivel(2);
        if(listaComp.get(0).atualizarPreco(usuario, 1000)==1){
            System.out.println("Preco atualizado com sucesso");
        }
        listaComp.get(0).listarDados();
        listaComp.get(1).listarDados();
    }
}
