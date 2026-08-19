public class Exemplo {
    public static void main(String[] args) {
        String strValor = "250";
        int qtd = 2;
        double resultado = qtd * Double.parseDouble(strValor);
        System.out.printf("R$ %.2f\n", resultado);
        int valor = 450;
        String strValor1, strValor2;
        strValor1 = Integer.toString(valor);
        strValor2 = String.valueOf(valor);
        Operacoes operacoes = new Operacoes();
        double x = operacoes.somar(4.0, 8.0);
    }
}
