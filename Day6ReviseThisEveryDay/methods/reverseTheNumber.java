package Day6ReviseThisEveryDay.methods;
import java.util.*;
public class reverseTheNumber {
  static int reverseNum(int n){
    int reverse=0;
    while (n>0) {
      int lastDigit = n%10;
      reverse = reverse*10+lastDigit;
      n = n/10;
    }
    return reverse;
  }
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
      System.out.print("Enter the Number:");
      int n = sc.nextInt();
      System.out.println("Reverse of the Number is:"+reverseNum(n));
    }
  }
}
