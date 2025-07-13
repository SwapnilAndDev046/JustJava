package Day11.Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheSmallest {
  static void small(int[]arr){
 try (Scanner sc = new Scanner(System.in)) {
   for (int i = 0; i < arr.length ; i++) {
     arr[i] = sc.nextInt();
   }
   System.out.println(Arrays.toString(arr));
   int min = arr[0];
   for (int i = 0; i < arr.length ; i++) {
     if (min>arr[i]){
       min = arr[i];
     }
   }
   System.out.println("the minimum num is "+min);
 }

  }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the Size of Array:");
      int size = sc.nextInt();
      int [] arr = new int[size];
      small(arr);
    }

  }
}
