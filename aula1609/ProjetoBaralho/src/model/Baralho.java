package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();


    public Baralho() {
        for(Naipe naipe : Naipe.values()) {
            for(Valor valor: Valor.values()) {
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta);
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }
    public void exibir(){
        System.out.println("Cartas do Baralho--->");
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }

    public Carta retirarCarta(){
        Carta carta = cartas.removeFirst();
        return carta;
    }
}
