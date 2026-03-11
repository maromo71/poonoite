import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionario {
    public List<Funcionario> funcionarios = new ArrayList<>();

    static void main() {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        GerenciarFuncionario gerenciar = new GerenciarFuncionario();
        do{
            System.out.println(">>>>> MENU PRINCIPAL <<<<<");
            System.out.println("1.. Cadastrar Funcionario");
            System.out.println("2.. Bonificar Funcionario");
            System.out.println("3.. Pesquisar Funcioanrio");
            System.out.println("4.. Listar Todos");
            System.out.println("5.. Excluir um Funcionario");
            System.out.println("6.. Inativar Funcionario");
            System.out.println("7.. Listar Funcionarios Inativos");
            System.out.println("8.. Listar Funcionarios Ativos");
            System.out.println("9.. SAIR");
            System.out.print(">>>>> ESCOLHA A OPCAO: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1 -> gerenciar.execCadastrar();
                case 2 -> gerenciar.execBonificar();
                case 3 -> gerenciar.execConsultar();
                case 4 -> gerenciar.execListarTodos();
                case 9 -> System.out.println("FIM");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao != 9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();
        System.out.println("Cadastro de novo funcionario...");
        System.out.println("Digite o nome do funcioario: ");
        func.setNome(sc.nextLine());
        System.out.println("Digite o RG do funcionario: ");
        func.setRg(sc.nextLine());
        System.out.println("Digite o departamento: ");
        func.setDepartamento(sc.nextLine());
        System.out.println("Digite o salario do funcionario: ");
        func.setSalario(Double.parseDouble(sc.nextLine()));
        func.setAtivo(true);
        funcionarios.add(func); //adicionando o funcionario a minha lista de funcs.
        System.out.println("Cadastro efetuado com sucesso");
    }
    public void execConsultar(){
        Scanner sc = new Scanner(System.in);
        String rgProc;
        System.out.println("Digite o RG da pessoa procurada: ");
        rgProc = sc.nextLine();
        //varrer lista a procura do funcionario com esse RG.
        Funcionario funcionarioProc = null;
        for(Funcionario func : funcionarios){
            if(func.getRg().equals(rgProc)){
                funcionarioProc = func; //achou o funcionario
                break;
            }
        }
        if(funcionarioProc != null){
            System.out.println(funcionarioProc.toString());
        }else{
            System.out.println("Funcionario nao encontrado...");
        }
    }
    public void execBonificar(){
        Scanner sc = new Scanner(System.in);
        String rgProc;
        System.out.println("Digite o RG da pessoa a bonificar: ");
        rgProc = sc.nextLine();
        //varrer lista a procura do funcionario com esse RG.
        Funcionario funcionarioProc = null;
        for(Funcionario func : funcionarios){
            if(func.getRg().equals(rgProc)){
                funcionarioProc = func; //achou o funcionario
                break;
            }
        }
        if(funcionarioProc != null){
            //precisa bonificar com o valor dado pelo usuario
            double valor;
            System.out.println("Digite o valor da bonificacao em reais");
            valor = Double.parseDouble(sc.nextLine());
            funcionarioProc.bonificar(valor);
        }else{
            System.out.println("Funcionario nao encontrado");
        }
    }

    public void execListarTodos(){
        for(Funcionario f : funcionarios){
            System.out.println(f.toString());
            System.out.println();
        }
    }
}
