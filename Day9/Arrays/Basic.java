package Day9.Arrays;

import java.util.Arrays;

public class Basic {
  public static void main(String[] args) {
    // syntax
    int[] RollNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int total = RollNum.length;
    System.out.println("class contain this may student " + total);
    System.out.println(RollNum[0] + RollNum[1]);
    // String[] StudentName = { "a", "b" };

    System.out.println(Arrays.toString(RollNum));// to print array
  }
}
