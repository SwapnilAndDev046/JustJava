

import java.util.Arrays;

public class movingZeros {
    public static void main(String[] args) {
        int [] nums = {1,0,3,4,0,0,2,0};
        System.out.println(Arrays.toString(movinZeros(nums)));
    }
    static int [] movinZeros(int [] nums){
        int left =0;
        int right=0;
        while (right<nums.length) {
            if (nums[right]!=0) {
                int temp = nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
            right++;
        }
        return nums;
    }
}
