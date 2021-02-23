package br.edu.fatecmm.prjaluno;

import br.edu.fatecmm.prjaluno.model.Apolice;

public class AlunoTeste {

    public static void main(String[] args) {
	    Apolice apolice = new Apolice();
	    apolice.setNomeSegurado("Marcos Moraes");
	    apolice.setIdade(49);
	    apolice.setPremio(500000.0);

	    apolice.imprimir();

    }
}
