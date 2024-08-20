package model;

public class Computador {
    //atributos
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    //metodos
    public void imprimir(){
        //exibir os atributos na tela
        System.out.println("Marca            = " + marca);
        System.out.println("Cor              = " + cor);
        System.out.println("Modelo           = " + modelo);
        System.out.println("Numero de Serie  = " + numeroSerie);
        System.out.println("Preço            = " + preco);
        System.out.println();
    }
    public void calcularValor(){
        //hp aumenta 30% e ibm aumenta 50%
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
        }
    }
    public boolean alterarValor(double valor){
        if(valor>0){
            preco = valor;
            return true;
        }
        return false;
    }
}
