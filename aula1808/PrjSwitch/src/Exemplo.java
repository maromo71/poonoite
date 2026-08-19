import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Excluir");
            System.out.println("9. Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> execCadastrar();
                case 2 -> execConsultar();
                case 3 -> execExcluir();
                case 9 -> System.out.println("FIM");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao!=9);
    }

    public static void execCadastrar(){
        System.out.println("Cadastro será implementado no futuro");
    }

    public static void execConsultar(){

    }

    public static void execExcluir(){

    }
}
