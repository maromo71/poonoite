public class Exemplo2 {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] v2 = new int[10];
        System.arraycopy(v1, 2, v2, 7, 3);
        for(int num : v2){
            System.out.println(num);
        }

    }
}
