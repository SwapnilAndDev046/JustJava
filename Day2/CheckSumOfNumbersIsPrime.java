package Day2;
import java.util.*;
public class CheckSumOfNumbersIsPrime {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the two Numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a+b;
      int count = 0;
      for(int i=1;i<=sum;i++){
        if(sum%i==0){
          count++;
        }
      }
      if(count==2){
        System.out.println("The Addition of the two number is Prime!");
      }
      else{
        System.out.println("The Addition of the two number is composite!");
      }
    } 
  }
}
