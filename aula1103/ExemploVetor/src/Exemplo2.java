public class Exemplo2 {
    public static void main(String[] args) {
        int[] v1 = new int[10];
        int[] v2 = {3, 5, 7, 9};
        System.arraycopy(v2, 0, v1, 5, 4);
        for(int x : v1){
            System.out.println(x);
        }
    }
}
