package br.com.pfalves.projetocomputador;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here
        Computador c1 = new Computador();
        c1.setMarca("HP");
        c1.setModelo("Novo");
        c1.setNumeroSerie(1234);
        c1.setCor("Branca");
        c1.setPreco(3000);
        c1.imprimir();
        System.out.println(); //pular linha
        c1.calcularValor();
        c1.imprimir();
        System.out.println();
        Computador c2 = new Computador();
        c2.setMarca("IBM");
        c2.setModelo("Velho");
        c2.setNumeroSerie(2345);
        c2.setCor("Prata");
        c2.setPreco(1000.0);
        c2.imprimir();
        System.out.println();
        c2.calcularValor();
        c2.imprimir();
        System.out.println();
        int retorno = c2.alterarValor(5000);

        if(retorno==1){
            System.out.println("Preco atualizado com sucesso");
        }else{
            System.out.println("Preco inválido");
        }
        System.out.println();
        c2.imprimir();



    }
}
