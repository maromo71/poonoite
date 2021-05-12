package br.edu.fatecmm.calculadora_gui.model;

import br.edu.fatecmm.calculadora_gui.util.ExemploTryException;

public class Cliente {
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws ExemploTryException {
        if(codigo <=0) throw new ExemploTryException(1);
    }
}
