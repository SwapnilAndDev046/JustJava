package Day16;

import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
        int [] nums = {0,1,9,3,4,3,6,7};
        System.out.println(Arrays.toString(moving(nums)));
    }
    static int [] moving(int [] nums){
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right]!=0) {
                int temp = nums[right];
                nums[right]=nums[left];
                nums[left] = temp;
                left++;
            }
        }
        return nums;
    }
}
