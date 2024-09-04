import model.JogoSorte;

import java.util.Scanner;

public class ExemploJogo {

    public static void main(String[] args) {
        int[] palpite = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite palpite 1");
        palpite[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Digite palpite 2");
        palpite[1] = Integer.parseInt(sc.nextLine());
        //Instaciar o Jogo
        JogoSorte jogo = new JogoSorte();
        double premio = jogo.jogar(palpite);
        if(premio > 0.0){
            System.out.println("Parabéns! você ganhou " + premio);
        }else{
            System.out.println("Infelizmente você não ganhou");
        }
    }


}
