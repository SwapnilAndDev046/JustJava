package Day10.ArrayQuestions;

// import java.util.Arrays;
import  java.util.*;
// import java.util.Scanner;

public class FindTheLargest{
  static void array1(int [] large){
    System.out.println(Arrays.toString(large));
    int max = large[0];
    for (int i = 0; i < large.length ; i++) {
      if (max<large[i]){
        max=large[i];
      }
    }
    System.out.println("max num from array is "+max);
  }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int [] nums = new int[10];
      System.out.print("Enter the nums:");
      for (int i = 0; i < nums.length; i++) {
        nums[i]= sc.nextInt();
      }
      array1(nums);
    }

  }
}