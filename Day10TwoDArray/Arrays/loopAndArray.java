package Day10TwoDArray.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class loopAndArray {
  static void array2(int n){
    
  try (Scanner sc = new Scanner(System.in)) {
    int [] arr = new int[n];
    for (int i = 0; i < arr.length ; i++) {
      arr[i] = sc.nextInt();
  }
      for (int i : arr) {
          System.out.print(i + " ");// give array answer using
      }
      //OR
    System.out.println("\n"+Arrays.toString(arr));
    }
System.out.println();
  }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter Size Array:");
        int n = sc.nextInt();
        array2(n);
    }

  }
}
