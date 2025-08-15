package Day19;

public class agnosticSearchPro {
    public static void main(String[] args) {
        int [] nums = {9,8,7,5,4,3,2,1};
        int target = 3;
        System.out.println(agnostic(nums,target));
    }
    static int agnostic(int[] nums,int target){
        int n = nums.length;
        int low = 0 ;
        int high = n-1;
        boolean isAscd = nums[low]<nums[high];
        while (low<=high) {
            int mid = (low+high)/2;
            if (nums[mid]==target) {
                return mid;
            }
            if (isAscd) {
                if (nums[mid]<target) {
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }else{
                if (nums[mid]<target) {
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}
