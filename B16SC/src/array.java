import java.util.Arrays;

public class array {


    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 18;


        System.out.println(nums.length);

        System.out.println(nums);
        // memory address: [I@e9e54c2
        System.out.println(Arrays.toString(nums));
        // using java.util.Array class:  [18, 0, 0]

    }
}
