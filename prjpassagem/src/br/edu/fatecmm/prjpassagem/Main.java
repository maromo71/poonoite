package br.edu.fatecmm.prjpassagem;
//Passagem por valor
public class Main {

    public static void alterar(int x){
        x+= 10;
        System.out.println("Valor x: " + x);
    }
    public static void main(String[] args) {
        int x = 15;
        alterar(x);
        System.out.println("Valor x: " + x);

    }
}
