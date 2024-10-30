import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite primeiro valor: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Digite segundo valor: ");
            b = sc.nextInt();
            System.out.println("Divisao resulta em: " );
            c = a / b;
            System.out.println(c);
        }catch (InputMismatchException e){
            System.out.println("Erro na Entrada de Dados. Formato inválido");
        }catch(NumberFormatException e) {
            System.out.println("Erro na Entrada de Dados. Erro na conversão");
        }catch (ArithmeticException e){
            System.out.println("Erro: Não divide inteiro por zero");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }finally {
            System.out.println("Passei aqui de qualquer jeito");
        }
    }
}
