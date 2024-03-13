public class Carro {
    //1. Atributos encapsulados
    private String marca;
    private String modelo;
    private double preco;
    private int ano;

    //métodos getters and setter

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Dados do carro");
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("preço = " + preco);
        System.out.println("ano = " + ano);
    }
}
