package Day15;

public class foundMin {
    public static void main(String[] args) {
        int[] arr = { 34, 22, 21, 12, 10, 45, 67, 21, 90, 54 };
        int min = arr[0];
        FoundMin(arr, min);
    }

    static void FoundMin(int[] arr, int min) {
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Smallest ele in array is:" + min);
    }
}
