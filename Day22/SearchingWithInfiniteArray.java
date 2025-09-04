package Day22;

public class SearchingWithInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 4, 4, 5, 8, 8, 9, 11, 12, 13, 15, 17, 18, 18, 19, 21, 23, 23, 23, 23, 24, 25, 27, 27, 28,
                29, 31, 31, 31, 32, 33, 33, 33, 34, 35, 36, 38, 38, 41, 44, 44, 45, 45, 46, 46, 47, 47, 48, 50, 50, 52,
                53, 53, 56, 56, 57, 57, 58, 60, 61, 62, 62, 63, 64, 66, 68, 69, 70, 70, 71, 71, 72, 72, 75, 75, 76, 76,
                76, 77, 78, 81, 82, 85, 87, 88, 89, 90, 90, 91, 93, 93, 94, 95, 96, 96, 97, 98, 98 };
        int target = 4;
        System.out.println("it is present at the " + infiniteArray(arr, target));
    }

    static int infiniteArray(int[] arr, int target) {
        int low = 0;
        int high = low + 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
            if (low > high) {
                high = 2 * high;
            }

        }
        return -1;
    }

}
