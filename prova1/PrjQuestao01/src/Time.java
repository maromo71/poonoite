import java.util.ArrayList;
import java.util.List;

public class Time {
    //Relacao com a classe Jogador
    private int idTime;
    private String nomeTime;
    private List<Jogador> jogadores;
    public Time(){
        jogadores = new ArrayList<>();
    }


    public int getIdTime(){
        return idTime;
    }
    public void setIdTime(int idTime){
        this.idTime = idTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void listarJogadores(){
        for(Jogador jogador : jogadores){
            System.out.println("Id: " + jogador.getIdJogador());
            System.out.println("Nome: " + jogador.getNomeJogador());
            System.out.println("Posicao: " + jogador.getPosicao());
            System.out.println("CAmisa:" + jogador.getNumCamisa());
            System.out.println();
        }
    }
}
