package Day23;

public class maxMountaintedArray {
    public static void main(String[] args) {
        int[] nums = { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 };
        binarySearch(nums);
    }
    static void binarySearch(int[] nums){
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        while (low<high) {
            int mid = low + (high + low)/2;
            if(nums[mid]>nums[mid+1]){
                //Decreasing 
                high = mid;
            }else{
                //ascending
                low = mid + 1;
            }
        }
     System.out.println(low);
    }
}
