package Day10TwoDArray.Arrays;

import java.util.Arrays;

public class ParsingInTheFunction {
    static void change(int[] arr) {
    arr[0]=93;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
}
