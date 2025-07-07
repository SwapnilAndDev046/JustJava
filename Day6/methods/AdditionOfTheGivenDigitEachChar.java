package Day6.methods;
import java.util.Scanner;
public class AdditionOfTheGivenDigitEachChar {
  static int AddDigit(int n){
    int Addition = 0;
    while(n>0){
      int lastDigit = n%10;
      Addition = Addition +lastDigit;// this code is similar to reverse the number just *10 is missing
      n = n/10;
    }
    return Addition;
  }
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
      System.out.print("Enter the Digit:");
      int n = sc.nextInt();
      System.out.println(AddDigit(n));
    }
  }
}
