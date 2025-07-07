package Day6ReviseThisEveryDay.methods;
import java.util.Scanner;
public class OddOrEvenMethodStyle {
  static boolean OddEven(int n){
    if (n%2==0) {
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
      System.out.print("Enter The number:");
      int n = sc.nextInt();
     if (OddEven(n)) {
      System.out.println("the Number is Even");
     }
     else{
      System.out.println("Number Is Odd");
     }
    }
    
  }
}
