import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, r;
        while(true){
            try{
                System.out.print("Informe o primeiro valor: ");
                a = Integer.parseInt(input.nextLine());
                System.out.print("Informe o segundo valor: ");
                b = input.nextInt();
                r = a / b;
                System.out.println("Resultado: " + r);
                break;
            }catch(InputMismatchException | NumberFormatException ex) {
                System.out.println("Valor invalido na entrada");
            }catch(ArithmeticException ex) {
                System.out.println("Erro de divisao por ZERO");
            }catch(Exception ex){
                System.out.println("Erro geral, desc: " + ex.getMessage());
            }finally{
                System.out.println("Executei o finally");
            }
        }


    }
}
