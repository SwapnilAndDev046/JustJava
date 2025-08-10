package Day18;

public class SecondLargest {
    public static void main(String[] args) {
       int [] nums = { 34, 22, 21, 12, 10, 45, 67, 21, 90, 54 };
       System.out.println(secondLarge(nums));
    }
    static int secondLarge(int [] nums){
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
        }
        int max2 = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i>max2 && i!=max) {
                max2=i;
            }
        }
        return max2;
    }
}
