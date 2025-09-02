package Day20;

public class ceilingNumber {
    static int ceiling(int[] nums,int target){
        int low = 0;
        int high = (nums.length)-1;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (nums[mid]==target) {
                return mid;
            }else if (nums[mid]>target) {
                high = mid-1;
            }else if (nums[mid]<target) {
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8};
        //ceiling means target<=smallest opposite of floor
        int target = 5;
        System.out.println("The ceiling of "+target+" is present at "+ceiling(nums,target));
    }
}
