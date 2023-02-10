import java.util.Arrays;

public class array {


    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 18;


        /**
         * length of allocated memory boxes, not filled locations are filled with 0.
         **/
        System.out.println(nums.length);
        // 3

        System.out.println(nums);
        // memory address: [I@e9e54c2
        System.out.println(Arrays.toString(nums));
        // using java.util.Array class:  [18, 0, 0]

    }
}
