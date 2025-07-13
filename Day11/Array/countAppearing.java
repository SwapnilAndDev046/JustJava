package Day11.Array;

import java.util.Arrays;
import java.util.Scanner;

public class countAppearing {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
           int[] arr = {1, 2, 2, 1, 3, 5, 1, 3, 51, 5, 1, 3, 5, 2};
           System.out.println(Arrays.toString(arr));
           int count = 0;
           int num = sc.nextInt();
           for (int i = 0; i < arr.length ; i++) {
                    if(num==arr[i]){
                        count++;
                    }
           }
           System.out.println("the "+num+" is appearing in an array for "+count+" times.");
       }

    }
}
