package model;

public class Carro {
    //atributos privados
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    //construtor
    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }
    //sobrecarga
    public Carro() {

    }
    //metodos modificadores de acesso

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //sobrescrever um metodo toString da classe Object
    //usa-se no lugar do famoso imprimir
    @Override
    public String toString() {
        return "Dados do Carro: \n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano Fab: " + ano + "\n" +
                "Placa: " + placa + "\n";
    }
}
