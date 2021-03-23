package br.edu.fatecmm.prjescola2;

import br.edu.fatecmm.prjescola2.model.Aluno;
import br.edu.fatecmm.prjescola2.model.Sexo;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
	    // Tres alunos
        Aluno a1 = new Aluno(12,"Maromo","maromo@gmailcom", "123");
        System.out.println(a1);

        System.out.println();
        //Aluno logando
        Aluno a2 = new Aluno("paul", "123");
        System.out.println(a2);
        System.out.println();

        //Vou cadastrar só dois dados que tenho
        Aluno a3 = new Aluno();
        a3.setRa(12);
        a3.setNome("Ricardo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Masculino ou Feminino para sexo: ");
        String sexo = sc.nextLine();
        Sexo sexoinf = null;
        if(sexo.equalsIgnoreCase("Masculino")){
            sexoinf = Sexo.Masculino;
        }
        if(sexo.equalsIgnoreCase("Feminino")){
            sexoinf = Sexo.Feminino;
        }
        if(sexoinf != null){
            a3.setSexo(sexoinf);
        }else {
            throw new IllegalArgumentException("Sexo inexistente");
        }
        System.out.println(a3);
    }
}
