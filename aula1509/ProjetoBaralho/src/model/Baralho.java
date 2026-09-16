package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    //construtor personalizado
    //objetivo: construir um baralho com 52 cartas
    public Baralho(){
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta carta = new Carta(valor, naipe);
                cartas.add(carta);
            }
        }
    }

    //metodo embaralhar
    public void embaralhar(){
        Collections.shuffle(cartas);
    }


    //metodo mostrarBaralho
    public void mostrarBaralho(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }

    //metodo maior valor de carta
    public Carta cartaMaiorValor(Carta carta1, Carta carta2){
        if(carta1.getValor() == carta2.getValor()){
            if(carta1.getNaipe().ordinal() > carta2.getNaipe().ordinal()){
                return carta1;
            }else{
                return carta2;
            }
        }else{
            if(carta1.getValor().ordinal() > carta2.getValor().ordinal()){
                return carta1;
            }else{
                return carta2;
            }
        }
    }

    //retirar uma carta do topo do baralho
    public Carta distribuirCarta(){
        Carta cartaRetirada = cartas.get(0);
        cartas.remove(0);
        return cartaRetirada;
    }

}
