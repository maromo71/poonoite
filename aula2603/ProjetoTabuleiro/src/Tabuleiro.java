import java.util.Random;

public class Tabuleiro {
    private int[][]matriz = new int[10][10];
    private int[]palpites = new int[3];

    public Tabuleiro(){
        //Objeto para gerar numeros
        Random random = new Random();
        //preencher o tabuleiro
        for (int i =0; i<10; i++){
            for (int j=0; j<10; j++){
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
    }
    //metodo publico jogar
    public double jogar(int[] palpites){
        this.palpites = palpites;
        int total = verificar();
        double premio = 0.0;
        if(total >=5){
            premio = total * 2000.0;
        }
        mostrarTabuleiro();
        return premio;
    }
    private int verificar() {
        int acertos = 0;
        for(int p=0; p<3; p++){//varrendo vetor palpites
            for(int i=0; i<10; i++){//varrendo as linhas da matriz
                for(int j=0; j<10; j++){//varrendo as colunas
                    if(palpites[p] == matriz[i][j])acertos++;
                }
            }
        }
        return acertos;
    }
    private void mostrarTabuleiro() {
        for(int[] vetor : matriz){
            for(int valor : vetor){
                if(valor == palpites[0]||valor==palpites[1]
                    || valor ==palpites[2]){
                    System.out.printf("[%3d*] ", valor);
                } else{
                    System.out.printf("[%3d ] ", valor);
                }
            }
            System.out.println();
        }
    }
}
