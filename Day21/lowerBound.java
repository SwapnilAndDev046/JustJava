package Day21;

public class lowerBound {
    public static void main(String[] args) {
        int[] nums = { 3,4,5,6,7, 9 };
        int target = 8;
        System.out.println(LowerBound(nums, target));
    }

    static int LowerBound(int[] nums, int target) {
        int n = nums.length;
        int mid, low = 0, high = n - 1;
        int count = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (nums[mid]==target) {
                count++;
            }
        }
        int index = count >= 1 ? low : -1;
        return index;
    }
}
