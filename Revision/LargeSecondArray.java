

public class LargeSecondArray {
    public static void main(String[] args) {
        int[] arr = { 198, 85, 12, 63, 49, 91, 5, 78, 30, 99, 14, 52, 21, 70, 43 };
        int max = -1;
        int max2 = -1;
        System.out.println("Second largest ele in array is: " + SecondLarge(arr, max, max2));
    }

    static int SecondLarge(int[] arr, int max, int max2) {
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        for (int i : arr) {
            if (max2 < i && i != max) {
                max2 = i;
            }
        }
        return max2;
    }
}
