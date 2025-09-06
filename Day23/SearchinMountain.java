package Day23;

public class SearchinMountain {
    static int peakInArray(int[] arr,int target, int low, int high,int n){
        while (low<high) {
            int mid = low + (high - low)/2;
            if (arr[mid]>arr[mid+1]) {
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low; 
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        int target = 3;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int end1 = peakInArray(arr,target,low,high,n);
        System.out.println(searchElementInArray(arr,target,n,end1));
    }
    static int searchElementInArray(int[] arr,int target,int n, int end1){
        int low = 0;
        int high = end1;
        while(low<=high){
            int mid = low + (high - low )/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high = mid - 1;
            }else if(arr[mid]<target){
                low = mid + 1;
            }
        }
        int start = end1+1;
        int end =  arr.length-1;
        while(start<=end){
            int mid = start + (end - start )/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                start = mid + 1;
            }else if(arr[mid]<target){
                end = mid - 1;
            }
        }
        return -1;
    }
}
