package Day19;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9;
        System.out.println("Index at this num is present is:" + binary(nums, target));
    }

    static int binary(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low<=high) {
            int mid  = (low+high)/2;
            if (target==nums[mid]) {
                return mid;
            } else if(target>nums[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
     
        return -1;
    }
}
