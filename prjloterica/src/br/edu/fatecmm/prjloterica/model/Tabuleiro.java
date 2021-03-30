package br.edu.fatecmm.prjloterica.model;


import java.util.Random;

public class Tabuleiro {
    private int matriz[][] = new int[10][10];
    private int palpites[] = new int[2];

    public Tabuleiro(){
        //Construtor - montar o tabuleiro
        //Regra - gerar numero de 0 a 10 para a matriz
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(101);
            }
        }
    }

    public double jogar(int x, int y){
        String mensagemDeErro = "Valores do palpite deve ser entre 0 e 100";
        if(x < 0 || x > 100){
            throw new IllegalArgumentException(mensagemDeErro);
        }
        if(y < 0 || y > 100){
            throw new IllegalArgumentException(mensagemDeErro);
        }
        palpites[0] = x;
        palpites[1] = y;
        double premio = verficarPremio();
        return premio;
    }


    private double verficarPremio() {
        int acertos = 0;
        double premio = 0.0;
        //percorre os dois palpites
        for (int p = 0; p < 2; p++) {
            //percorre a matriz
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(palpites[p] == matriz[i][j]) acertos++;
                }
            }
        }
        if(acertos >= 3){
            premio = acertos * 1000.0;
        }
        listar();
        return premio;
    }

    private void listar() {
        //listar a matriz identicando os acertos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(palpites[0] == matriz[i][j] || palpites[1] == matriz[i][j]){
                    System.out.printf("[%3d]* ", matriz[i][j]);
                }else{
                    System.out.printf("[%3d]  ", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }


}
