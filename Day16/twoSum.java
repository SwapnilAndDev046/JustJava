package Day16;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 5, 7, 8 };
        int target = 10;
        System.out.println(Arrays.toString(sortedTwoSum(nums, target)));
    }

    static int[] sortedTwoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                return new int[] { start, end };
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] { -1, -1 };
    }
}
