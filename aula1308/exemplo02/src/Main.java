/*
Comentário de Várias
Linhas
 */
public class Main {
    public static void main(String[] args) {
        //Conversão de tipos
        String strValor = "5000";
        int valor = Integer.parseInt(strValor);
        //dupla precisão. ao menos um - nao precisa de cast
        double resultado = valor * 0.10;
        System.out.println(resultado);

        //De double para String
        double salario = 8791.89;
        String strSalario = Double.toString(salario);
        //String strSalario = String.valueOf(salario);

        System.out.println("String salario: " + strSalario);
        System.out.println(somar(10, 30));

    }

    /**
     * Função somar: soma dois valores inteiros e retorna o resultado
     * @param a - primeiro valor inteiro passado como parâmetro
     * @param b - segundo valor inteiro passado como parâmetro
     * @return - a soma dos dois valores
     */
    public static int somar(int a, int b) {
        return a + b;
    }
}