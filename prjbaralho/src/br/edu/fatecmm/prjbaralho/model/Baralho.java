package br.edu.fatecmm.prjbaralho.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta>cartas = new ArrayList<>();

    public Baralho(){
        montar();
    }

    private void montar() {
        //varrendo os enumeradores (valores - values)
        for (Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta carta = new Carta();
                carta.setValor(valor);
                carta.setNaipe(naipe);
                cartas.add(carta);
            }
        }
    }

    public void embaralhar(){
        //para embaralhaar
        Collections.shuffle(cartas);
    }

    public List<Carta> exibir(){
        return cartas;
    }
}
