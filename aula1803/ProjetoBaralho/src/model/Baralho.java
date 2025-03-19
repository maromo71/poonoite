package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    public Baralho() {
        for(Naipe naipe : Naipe.values()) {
            for(Valor valor : Valor.values()) {
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta);
            }
        }
    }

    public void imprimirBaralho() {
        for(Carta carta : cartas) {
            System.out.println(carta);
        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }
}
