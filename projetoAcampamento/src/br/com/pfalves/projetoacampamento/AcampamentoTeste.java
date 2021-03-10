package br.com.pfalves.projetoacampamento;

public class AcampamentoTeste {

    public static void main(String[] args) {
	// write your code here
        Acampamento membro = new Acampamento();
        membro.setNome("Ricardo Souza");
        membro.setIdade(21);
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();
    }
}
