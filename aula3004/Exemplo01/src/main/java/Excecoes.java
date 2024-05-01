import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        try{
            int x = 10;
            int divisor;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o divisor");
            divisor = Integer.parseInt(sc.nextLine());

            System.out.println("Resultado: ");
            System.out.println(x / divisor);
        }catch (NumberFormatException ex){
            System.out.println("Erro: ");
            System.out.println("Valor inválido. Repita");
        }catch (ArithmeticException ex) {
            System.out.println("Erro: ");
            System.out.println("Impossível dividir por ZERO");
        }catch (Exception ex){
            System.out.println("Erro Grave: ");
            System.out.println("Mensagem do erro: " + ex.getMessage());
        }finally {
            System.out.println("Passei aqui");
        }

    }
}
