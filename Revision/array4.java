

import java.util.Arrays;
import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int [] arr = new int[5];
        for(int num:arr){
            arr[num] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       }
    }
}
