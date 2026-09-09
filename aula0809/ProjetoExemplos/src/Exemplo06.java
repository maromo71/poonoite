public class Exemplo06 {

    public static void alterarValor(int x){
        x = 50;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 23;
        alterarValor(x);
        System.out.println(x);
    }
}
