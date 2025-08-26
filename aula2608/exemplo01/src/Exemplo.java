import java.util.Scanner;

public class Exemplo {

    /**
     * Função que soma dois valores
     * @param a refere-se ao primeiro valor float enviado pelo usuario
     * @param b refere-se ao segundo valor
     * @return resulta na soma dos dois valores
     */
    public static float somar(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        // variáveis
        float a, b, soma;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        a = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite um valor: ");
        b = Float.parseFloat(leitor.nextLine());
        /*
          mais do que
          uma linha de comentario
         */
        soma = somar(a, b);
        System.out.println("Soma: " + soma);
    }

}
