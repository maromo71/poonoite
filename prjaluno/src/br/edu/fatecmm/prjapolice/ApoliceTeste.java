package br.edu.fatecmm.prjapolice;

import br.edu.fatecmm.prjapolice.model.Apolice;

public class ApoliceTeste {

    public static void main(String[] args) {
	    Apolice apolice = new Apolice();
	    apolice.setNomeSegurado("Marcos Moraes");
	    apolice.setIdade(49);
	    apolice.setPremio(500000.0);

	    apolice.imprimir();

    }
}
