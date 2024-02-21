public class Carro {
    //Atributos
    public String modelo;
    public String marca;
    public String cor;
    public int ano;
    public int velocidade;

    //Métodos
    public void acelerar(int forca){
        velocidade += forca;
    }
    public void desacelerar(int forca){
        velocidade -= forca;
    }

    public void exibirDados(){
        System.out.println("modelo = " + modelo);
        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("velocidade = " + velocidade);
        System.out.println("ano = " + ano);
    }


}
