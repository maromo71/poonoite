package br.edu.fatecmm.prjfuncionario;

import br.edu.fatecmm.prjfuncionario.model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionarios {
    List<Funcionario> lista = new ArrayList<>();

    public static void main(String[] args) {
	    GerenciarFuncionarios gf = new GerenciarFuncionarios();
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Consultar");
            System.out.println("3.. Bonificar");
            System.out.println("9.. Sair");
            System.out.println("Entre com sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    gf.execCadastrar();
                    break;
                case 2:
                    gf.execConsultar();
                    break;
                case 3:
                    gf.execBonificar();
                    break;
                case 9:
                    System.out.println("Fim do Programa!!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc !=9);
    }

    public void execCadastrar(){
        //Criar um novo funcionário.
        //Pedir os dados de entrada para o usuário
        //Adicionar na lista
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        System.out.println("Digite o nome do funcionário: ");
        f.setNome(sc.nextLine());
        System.out.println("Digite o nome do departamento: ");
        f.setDepartamento(sc.nextLine());
        System.out.println("Digite o salário do funcionário: ");
        f.setSalario(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o RG do funcionário: ");
        f.setRg(sc.nextLine());
        f.setEstaNaEmpresa(true);
        lista.add(f); //adicionamos o funcionário na lista
        System.out.println("Funcionário cadastrado com sucesso..");


    }
    public void execBonificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do funcionário a bonificar: ");
        String rgProc = sc.nextLine();
        //varrer a lista procurando alguém que tenha este rg
        for(Funcionario f : lista){
            if(f.getRg().equals(rgProc)){
                System.out.println("Digite o valor da bonificação: ");
                double valor = Double.parseDouble(sc.nextLine());
                f.bonificar(valor);
                System.out.println("Bonificação efetuada");
                return;
            }
        }
        System.out.println("Não existe funcionáiro com este RG");
    }
    public void execConsultar(){
        //Varrer a lista e imprimir os funcionário ativos
        for (Funcionario f: lista) {
            if(f.isEstaNaEmpresa()){
                System.out.println(f.toString());
            }
            System.out.println();
        }
    }


}
