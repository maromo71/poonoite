package net.maromo.exemplo_hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pessoa p1 = new Pessoa();
        p1.setIdPessoa(777);
        p1.setNomePessoa("João Carlos da Silva");
        Pessoa p2 = new Pessoa();
        p2.setIdPessoa(115);
        p2.setNomePessoa("Rodrigo Henrique Santos");
        Pessoa p3 = new Pessoa();
        p3.setIdPessoa(221);
        p3.setNomePessoa("Ana Olívia Santos");

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        Collections.sort(pessoas);
        for (Pessoa x: pessoas  ) {
            System.out.println(x);
        }


    }
}
