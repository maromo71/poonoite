package ui;

import model.Baralho;
import model.Carta;

public class GerenciarBaralho {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println(baralho);
        baralho.embaralhar();
        System.out.println(); //pular linha
        System.out.println(baralho);

        Carta cartaRetirada = baralho.sortearUmCarta();
        System.out.println("Carta retirada neste momento");
        System.out.println(cartaRetirada);
        System.out.println("Baralho agora está com");
        System.out.println(baralho.getCartas().size());
        
    }

}
