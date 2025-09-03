package Day21;

public class UpperBound {
    public static void main(String[] args) {
        int[] nums = {3,4,8,8,8,8,8,9};
        int target = 8;
        System.out.println(upperBound(nums, target));
    }
    static int upperBound(int[] nums, int target){
        int n = nums.length, low = 0, high = n-1, mid, count=0;
        while (low<=high) {
            mid = low + (high - low);
            if (nums[mid]<=target) {
                low = mid + 1;
            }else{
                high = mid -1;
            }
            if(nums[mid]==target){
                count++;
            }
        }
        int index = count>=1 ? high : -1 ; 
        return index;
    }
}
