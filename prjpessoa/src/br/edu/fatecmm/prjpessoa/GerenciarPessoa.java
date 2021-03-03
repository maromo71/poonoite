package br.edu.fatecmm.prjpessoa;

import br.edu.fatecmm.prjpessoa.modelo.Endereco;
import br.edu.fatecmm.prjpessoa.modelo.Pessoa;

public class GerenciarPessoa {
    public static void main(String[] args) {
       	// Criar duas pessoas e fazer impressao dos dados delas
        Pessoa p1, p2; //reservei um espaço na stack

        Endereco e1 = new Endereco();
        e1.setIdEndereco(1);
        e1.setLogradouro("Rua das Camelias ");
        e1.setNumero("234 a");
        e1.setCidade("Campinas");
        e1.setEstado("SP");

        p1 = new Pessoa();
        p1.setIdPessoa(1);
        p1.setNome("Antonio Carlos");
        p1.setEndereco(e1);

        System.out.println("Dados do Antonio");
        System.out.println(p1.toString());

        p2 = new Pessoa();
        p2.setIdPessoa(2);
        p2.setNome("Maria do Antonio");
        p2.setEndereco(e1);

        //imprimir os dados

        System.out.println();
        System.out.println("Dados da Maria");
        System.out.println(p2);



    }
}
