public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private int ano;

    public Carro(){

    }

    public Carro(String marca,
                 String modelo,
                 String cor,
                 String placa,
                 int ano){
        this.marca =marca;
        this.modelo =modelo;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
    }
}
