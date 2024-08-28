import model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionarios {
    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    private Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        //Instanciar um objeto para gerenciar funcionarios
        GerenciarFuncionarios gerenciar = new GerenciarFuncionarios();

        int opcao = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Bonificar");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(gerenciar.leitor.nextLine());
            switch(opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execConsultar();
                    break;
                case 3:
                    gerenciar.execBonificar();
                    break;
                case 9:
                    System.out.println("FIM do PROGRAMA");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }while(opcao != 9);
    }

    public void execConsultar(){
        //exibir toda a lista de funcionarios
        System.out.println("Lista de Todos os funcionários: ");
        for(Funcionario funcionario : listaFuncionarios){
            System.out.println(funcionario);
        }
        System.out.println("---------------------------------");
    }
    public void execBonificar(){
        //pedir o valor a ser bonifica
        double valor;
        System.out.println("Digite o valor da bonificação geral: ");
        valor = Double.parseDouble(leitor.nextLine());
        //bonificar todos os funcionario com o mesmo bonus
        for(Funcionario funcionario : listaFuncionarios){
            funcionario.bonificar(valor);
        }
    }
    public void execCadastrar(){
        System.out.println("Digite o nome do funcionário: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o departamento: ");
        String departamento = leitor.nextLine();
        System.out.println("Digite o valor do salário: ");
        double salario = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite o RG do funcionario");
        String rg = leitor.nextLine();
        Funcionario funcionario = new Funcionario(
                departamento, salario, rg, nome
        );
        listaFuncionarios.add(funcionario); //adicionou na lista
        System.out.println("Funcionário cadastrado com sucesso!");
    }
}
