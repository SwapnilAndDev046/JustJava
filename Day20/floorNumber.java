package Day20;

public class floorNumber {
    static int FloorNumber(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid]==target) {
                return nums[mid];
            }else if (nums[mid]>target) {
                high = mid - 1;
            }else if (nums[mid]<target) {
                low = mid + 1;
            }
        }
        return nums[low-1];
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 7, 12, 23, 34, 45, 56 };
        int target = 2;
        System.out.println("the Floor for target " + target + " is " + FloorNumber(nums, target));
    }
}
