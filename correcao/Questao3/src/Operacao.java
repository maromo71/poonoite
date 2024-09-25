public class Operacao {

    public int contarDigitos(int n){
        return Integer.toString(n).length();
    }


    public static void main(String[] args) {
        Operacao operacao = new Operacao();
        System.out.println(operacao.contarDigitos(5000));

    }
}
