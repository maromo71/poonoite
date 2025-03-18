package model;

import java.util.Random;

public class Tabuleiro {
    private int[][] tabuleiro = new int[10][10];
    private int[] palpites = new int[2];

    //preencher o tabuleiro
    public Tabuleiro() {
        Random aleatorio = new Random();
        for(int i = 0; i<10; i++){
            for(int j =0; j<10; j++){
                tabuleiro[i][j] = aleatorio.nextInt(100) + 1;
            }
        }
    }
    public double jogar(int p1, int p2) {
        palpites[0] = p1;
        palpites[1] = p2;
        int totalAcertos = verificarAcertos();
        mostrarTabuleiro();
        return totalAcertos * 1000.0;
    }

    private void mostrarTabuleiro() {
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                if(tabuleiro[i][j] == palpites[0] || tabuleiro[i][j] == palpites[1]){
                    System.out.printf("[%3d]* ", tabuleiro[i][j]);
                }else{
                    System.out.printf("[%3d]  ", tabuleiro[i][j]);
                }
            }
            System.out.println();
        }
    }

    private int verificarAcertos(){
        int cont = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(tabuleiro[i][j]==palpites[0] || tabuleiro[i][j]==palpites[1]){
                    cont++;
                }
            }
        }
        if(cont < 3){
            return 0;
        }
        return cont;
    }
}
