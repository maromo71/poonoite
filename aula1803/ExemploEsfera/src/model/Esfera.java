package model;

public class Esfera {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getVolume(){
        return 4.0/3 * Math.PI * Math.pow(raio, 3);
    }
}
