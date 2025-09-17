package model;

public class Boleto {
    public int num;
    public double valor;
    public Mes mesVencimento;

    public void imprimir(){
        System.out.println("Boleto num: " + num);
        System.out.println("Boleto valor: " + valor);
        System.out.println("Mes Vencimento: " + mesVencimento);
    }
}
