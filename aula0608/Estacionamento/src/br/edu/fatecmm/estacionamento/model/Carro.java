package br.edu.fatecmm.estacionamento.model;

public class Carro {
    //Atributos
    public String marca;
    public String modelo;
    public String placa;
    public int ano;

    //Métodos
    public void estacionar(){
        System.out.println("Carro estacionado: " + modelo);
    }

    public void retirar(){
        System.out.println("Carro retirado: " + modelo);
    }

    public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}
