public class Exemplo04 {
    public static void main(String[] args) {
        int[] v1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] v2 = new int[10];
        System.arraycopy(v1, 3, v2, 6, 4);
        for(int x : v2){
            System.out.println(x);
        }
    }
}
