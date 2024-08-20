import model.Computador;

import java.util.Scanner;

public class ComputadorTeste {
    public static void main(String[] args) {
        //primeiro computador
        Computador computador1 = new Computador();
        computador1.marca = "HP";
        computador1.modelo = "Computador";
        computador1.cor = "branco";
        computador1.preco = 3000.0;
        computador1.numeroSerie = 234567;
        computador1.imprimir();
        //calcular valor
        computador1.calcularValor();
        computador1.imprimir(); //valor calculado
        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Computador Velho";
        computador2.cor = "Branco";
        computador2.preco = 1000.0;
        computador2.numeroSerie = 3456789;
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir(); //depois de calculador valor
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o novo preco do computador IBM");
        double novo = Double.parseDouble(leitor.nextLine());
        //teste
        if(computador2.alterarValor(novo)){
            System.out.println("Valor alterado com sucesso!");
        }else{
            System.out.println("Valor deve ser POSITIVO!");
        }
        computador2.imprimir();
    }
}
