public class Carro {
    //Atributos
    private String placa;
    private String modelo;
    private String marca;
    private int ano;

    //getters and setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //imprimir
    public void imprimir() {
        System.out.println("Dados do Carro:");
        System.out.println("placa = " + placa);
        System.out.println("modelo = " + modelo);
        System.out.println("marca = " + marca);
        System.out.println("ano = " + ano);
        System.out.println("--------------------");
    }
}
