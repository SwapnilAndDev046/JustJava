package Day17;

public class maxInTwoDArray {
    public static void main(String[] args) {
        int [] [] nums ={
            {2,3,5},
            {3,4,6},
            {1,5,6}
        };
       System.out.println(TwoDArray(nums));  
    }
    static int TwoDArray(int[] [] nums){
        int max= Integer.MIN_VALUE;
        for (int []  i : nums) {
            int sum =0;
            for (int  j : i) {
                sum = sum + j;
            }
            if (sum>max) {
                max = sum;
            }
        }
        return max;
    }
}
