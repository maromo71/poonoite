package model;

import java.util.Random;

public class Tabuleiro {
    private int[][] matriz = new int[10][10];
    private int[] palpites = new int[2];

    //Construtor personalizado
    public Tabuleiro(){
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                matriz[i][j] = rand.nextInt(100) + 1;
            }
        }
    }

    //metodo jogar recebe palpites e devolve o premio
    public double jogar(int p1, int p2){
        palpites[0] = p1;
        palpites[1] = p2;
        int acertos = verificarPalpites();
        exibirTabuleiro();
        if(acertos >= 3){
            return acertos * 1000.0;
        }else{
            return 0.0;
        }
    }

    private int verificarPalpites() {
        int cont = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(palpites[0] == matriz[i][j] || palpites[1] == matriz[i][j]){
                    cont++;
                }
            }
        }
        return cont;
    }
    private void exibirTabuleiro(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(palpites[0] == matriz[i][j] || palpites[1] == matriz[i][j]){
                    System.out.printf("[%3d]* ", matriz[i][j]);
                }else{
                    System.out.printf("[%3d]  ", matriz[i][j]);
                }
            }
            System.out.println(); // pular linha depois das dez colunas
        }
    }
}
