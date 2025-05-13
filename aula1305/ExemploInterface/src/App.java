import model.*;
import utils.GerenciarAcesso;

public class App {
    public static void main(String[] args) {
        //Gerente1, Gerente2 logar
        //Secretaria logar
        //Operador logar
        //Cliente logar
        //Gerente2 vai sair do sistema
        //logo em seguida, mostra a lista de
        //quem está logado e quantos estão logados (no momento)
        Gerente gerente1 = new Gerente();
        Gerente gerente2 = new Gerente();
        Secretaria secretaria = new Secretaria();
        Operador operador = new Operador();
        Cliente cliente = new Cliente();
        gerente1.efetuarLogin();
        gerente2.efetuarLogin();
        secretaria.efetuarLogin();
        System.out.println("Logados agora: ");
        for(Logavel o : GerenciarAcesso.logados){
            System.out.println(o);
        }
        gerente2.efetuarLogout();
        System.out.println("logados depois: " +
                GerenciarAcesso.logados.size());
        for(Logavel o : GerenciarAcesso.logados){
            System.out.println(o);
        }
    }
}
