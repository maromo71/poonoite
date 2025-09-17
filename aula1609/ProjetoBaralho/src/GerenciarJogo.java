import model.Baralho;
import model.Carta;

public class GerenciarJogo {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.exibir();
        baralho.embaralhar();
        baralho.exibir();
        Carta carta1 = baralho.retirarCarta();
        Carta carta2 = baralho.retirarCarta();

        if(carta1.getValor().ordinal() > carta2.getValor().ordinal()){
            System.out.println("Carta 1 é maior");
        } else if (carta2.getValor().ordinal() > carta1.getValor().ordinal()) {
            System.out.println("Carta 2 é maior");

        }else{
            if(carta1.getNaipe().ordinal() < carta2.getNaipe().ordinal()){
                System.out.println("Carta 1 é maior");
            }else{
                System.out.println("Carta 2 é maior");
            }
        }
        System.out.println(carta1);
        System.out.println(carta2);
    }
}
