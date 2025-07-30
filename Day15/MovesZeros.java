package Day15;

import java.util.Arrays;

//parallel pointers
public class MovesZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 5, 0, 3, 4, 0, 7, 0 };
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    static int[] moveZeros(int  [] arr) {
        // parallel pointers
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        return arr;
    }
}
