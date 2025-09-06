package Day24;

public class peakInRotatedArray {
    static int peak(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (high > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 9, 0, 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(peak(arr));
    }
}
