import java.util.ArrayList;
import java.util.List;

public class PrjAvaliacaoTest {


    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.setIdJogador(12);
        jogador1.setNomeJogador("Caio");
        jogador1.setNumCamisa(12);
        jogador1.setPosicao("Goleiro");

        Jogador jogador2 = new Jogador();
        jogador2.setIdJogador(13);
        jogador2.setNomeJogador("Zezinho");
        jogador2.setNumCamisa(15);
        jogador2.setPosicao("Meio campista");

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador1);
        jogadores.add(jogador2);
        Time time1 = new Time();
        time1.setIdTime(1);
        time1.setNomeTime("Fluminense");
        //Passando os dois jogadores para fazer parte do time
        time1.setJogadores(jogadores);

        time1.listarJogadores();
    }

}
