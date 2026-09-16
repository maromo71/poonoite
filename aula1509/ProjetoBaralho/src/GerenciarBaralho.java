import model.Baralho;
import model.Carta;

public class GerenciarBaralho {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.mostrarBaralho();
        System.out.println("================ embaralhado ============");
        baralho.embaralhar();
        baralho.mostrarBaralho();
        Carta carta1 = baralho.distribuirCarta();
        Carta carta2 = baralho.distribuirCarta();
        System.out.println("============= cartas retridas ============");
        System.out.println(carta1);
        System.out.println(carta2);
        System.out.println("======= Maior das duas cartas ============");
        System.out.println(baralho.cartaMaiorValor(carta1, carta2));
    }
}
