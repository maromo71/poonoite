package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    //Método para construir um baralho
    public Baralho(){
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta); //adiciona a carta na lista
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baralho atual: \n");
        for(Carta carta : cartas){
            sb.append(carta);
        }
        return sb.toString();
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta sortearUmCarta(){
        embaralhar();
        Carta carta = cartas.get(0);
        cartas.remove(carta);

        return carta; //primeira carta

    }

    public List<Carta> getCartas() {
        return cartas;
    }
}

