package cli;

import model.Baralho;

public class GerenciarJogo {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.imprimirBaralho();
        System.out.println();
        baralho.embaralhar();
        baralho.imprimirBaralho();
    }
}
