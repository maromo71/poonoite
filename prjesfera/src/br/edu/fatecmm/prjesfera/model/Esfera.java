package br.edu.fatecmm.prjesfera.model;


public class Esfera {
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    public double getVolume(){
        return 4/3.0 * Math.PI * Math.pow(raio, 3.0);
    }
}
