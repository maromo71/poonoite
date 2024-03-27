import java.util.Scanner;

public class GerenciarJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabuleiro jogo = new Tabuleiro();
        int[] palpites = new int[3];
        for (int i = 0; i < palpites.length; i++) {
            System.out.println("Digite o palpite: " + (i + 1));
            palpites[i] = Integer.parseInt(sc.nextLine());
        }
        double premio = jogo.jogar(palpites);
        if(premio > 0){
            System.out.println("Parabéns!!!!");
            System.out.println("Seu prêmio: R$ " + premio);
        }else{
            System.out.println("Infelizmente, perdeu.");
        }
    }
}