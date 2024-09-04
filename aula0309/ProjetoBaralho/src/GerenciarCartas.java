import model.Baralho;

public class GerenciarCartas {
    public static void main(String[] args) {
        //Criar o Baralho
        Baralho baralho = new Baralho();

        //Exibir o baralho
        baralho.exibirBaralho();

        //pular uma linha
        System.out.println();

        //Embaralhar
        baralho.embaralhar();

        //Exibir o baralho
        baralho.exibirBaralho();
    }
}
