package Day16;

import java.util.Arrays;

public class searchInTwoDArray {
    public static void main(String[] args) {
        int [] [] nums = {
            {24,4,1},
            {18,12,3,9},
            {78,99,34,56,},
            {18,12}
        };
        int target = 3;
       System.out.println(Arrays.toString(search(nums,target)));
    }
    static int [] search(int [][] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j]==target) {
                    return new int[]{i,j};//returns index
                }
            }
        }
        return new int[] {-1,-1};
    }
}
