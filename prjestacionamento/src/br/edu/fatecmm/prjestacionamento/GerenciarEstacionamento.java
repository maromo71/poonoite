package br.edu.fatecmm.prjestacionamento;

import br.edu.fatecmm.prjestacionamento.model.Carro;
import br.edu.fatecmm.prjestacionamento.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
	    //Criar três carros
        //Criar dois clientes
        //1 cliente possui dois carros
        //outro cliente possui um carro
        Carro carro1 = new Carro(1, "Fiat", "Uno", 2014, 10000.0);
        Carro carro2 = new Carro(2, "Fiat", "Punto", 2017, 28000.0);
        Carro carro3 = new Carro(3, "Nissan", "Versa", 2018, 35000.0);

        Pessoa cliente1 = new Pessoa(
                1,
                "Carlos",
                "carlos@ciet.com",
                "(19)9999-9999");
        Pessoa cliente2 = new Pessoa(
                2,
                "Julio Cesar",
                "julio@gmail.com",
                "(19)8888-8888");

        Carro carro4 = new Carro();

        cliente1.adicionarCarro(carro1);
        cliente1.adicionarCarro(carro2);
        cliente2.adicionarCarro(carro3);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());


    }
}
