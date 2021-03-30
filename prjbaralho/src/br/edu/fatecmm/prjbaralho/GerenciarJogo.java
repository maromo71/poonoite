package br.edu.fatecmm.prjbaralho;

import br.edu.fatecmm.prjbaralho.model.Baralho;
import br.edu.fatecmm.prjbaralho.model.Carta;

public class GerenciarJogo {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println("Baralho Montado.......");
        for(Carta carta : baralho.exibir()){
            System.out.println(carta.toString());
        }
        System.out.println();
        baralho.embaralhar();
        System.out.println("Baralho Embaralhado.......");
        for(Carta carta : baralho.exibir()){
            System.out.println(carta.toString());
        }
    }
}
