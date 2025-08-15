package Day19;

public class agnosticBinarySearchNOOB {
    public static void main(String[] args) {
        int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 3;
        agnosticArray(nums, target);
    }

    static void agnosticArray(int[] nums, int target) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        if (nums[low] < nums[high]) {
            while (low <= high) {
                int mid = (high + low) / 2;
                if (nums[mid] < target) {
                    low = mid + 1;
                } else if (nums[mid] > target) {
                    high = mid - 1;
                } else {
                    System.out.println("Ascending order:" + mid);
                    break;
                }
            }
        } else if (nums[low] > nums[high]) {
            while (low <= high) {
                int mid = (high + low) / 2;
                if (nums[mid] < target) {
                    high = mid - 1;
                } else if (nums[mid] > target) {
                    low = mid + 1;
                } else {
                    System.out.println("Descending order:" + mid);
                    break;
                }
            }
        }else{
            System.out.println("ele not present");
        }
    }
}
