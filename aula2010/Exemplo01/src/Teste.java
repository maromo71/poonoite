import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Digite outro valor: ");
            int b = Integer.parseInt(sc.nextLine());
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        }catch(NumberFormatException ex){
            System.out.println("Entrada de Valor invalido!");
        }catch(ArithmeticException ex){
            System.out.println("Impossivel dividir inteiro por ZERO!");
        }catch(Exception ex){
            System.out.println("Erro inesperado, mensagem: ");
            System.out.println(ex.getMessage());
        }
    }
}
