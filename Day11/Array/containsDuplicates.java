package Day11.Array;

// import java.sql.SQLOutput;
import java.util.Arrays;

public class containsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1, 2, 3, 4, 5, 3, 4, 5, 4, 64, 2};
        System.out.println(Arrays.toString(arr));
        int count;
        System.out.println("This numbers are reaped:");
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (2<=count){

                System.out.println(arr[i]);
            }
        }
    }
}