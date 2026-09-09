import java.util.Arrays;

public class Exemplo03 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 89, 11, 34};
        Arrays.sort(nums);
        for(int x : nums){
            System.out.println(x);
        }
    }
}
