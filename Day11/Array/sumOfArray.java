package Day11.Array;

import java.util.Arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] a = {543,54,34,2,4,25,5,6,7676,2};
        System.out.println(Arrays.toString(a));
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum = sum+a[i];
        }
        System.out.println("Sum of the Array is "+sum);
    }
}
