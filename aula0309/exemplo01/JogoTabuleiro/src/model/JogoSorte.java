package model;

import java.util.Random;

public class JogoSorte {
    private int[][] tabuleiro = new int[10][10];
    private int[] palpite = new int[2];

    public JogoSorte() {
        //Lógica para construir o tabuleiro
        Random random = new Random();
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                tabuleiro[i][j] = random.nextInt(1, 101);
            }
        }
    }

    public double jogar(int[] palpite){
        this.palpite = palpite;
        return verificarPremio();
    }

    private double verificarPremio() {
        int cont = 0;
        for(int p=0; p<2; p++){
            for(int l=0; l<10; l++){
                for(int c=0; c<10; c++){
                    if(palpite[p] == tabuleiro[l][c]){
                        cont++;
                    }
                }
            }
        }
        exibirTabuleiro();
        return (cont >= 3 ? cont * 1000.0 : 0.0);
    }

    private void exibirTabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(tabuleiro[i][j] == palpite[0]||tabuleiro[i][j] == palpite[1]){
                    System.out.printf("[%3d]* ", tabuleiro[i][j]);
                }else{
                    System.out.printf("[%3d]  ", tabuleiro[i][j]);
                }
            }
            System.out.println(); //pular uma linha
        }
    }
}
