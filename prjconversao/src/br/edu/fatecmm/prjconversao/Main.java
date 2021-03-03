package br.edu.fatecmm.prjconversao;

public class Main {

    public static void main(String[] args) {
	    String strValor = "1200";
	    int x = 200;
	    int resultado = x + Integer.parseInt(strValor);
        System.out.println("Valor total: " + resultado);

        String frase;
        frase = "Do total de " + strValor + " foram vendidas " + String.valueOf(x);
        System.out.println(frase);

        double valorDouble = Double.parseDouble(strValor);


    }
}
