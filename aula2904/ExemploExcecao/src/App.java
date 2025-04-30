import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite valor para a: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Digite valor para  b:");
            b = Integer.parseInt(sc.nextLine());
            int resultado = a / b;
            System.out.println(resultado);
        }catch (NumberFormatException ex){
            System.out.println("Erro na entrada de dados (vlr inv)");
        }catch (ArithmeticException ex){
            System.out.println("Erro de divisao por zero");
        } catch (Exception ex) {
            System.out.println("Aconteceu o erro: " + ex.getMessage());
        } finally {
            System.out.println("Passei aqui de qualquer jeito");
        }

    }
}
