public class Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        ret.altura = 10;
        ret.base = 2;
        int result = ret.calcularArea();
        System.out.println(result);
    }
}