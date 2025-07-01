package Day2;
import java.util.*;
public class CheckPrime {
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
      System.out.print("Check number is prime or not: ");
      int num = sc.nextInt();
      int count =0;
    for(int i=1;i<=num;i++){
      if(num%i==0){
        count++;//it will become 2 or more 
      }
    }
    if (count==2) {
      System.out.println("This Num is prime");
    }
    else if (count>2){
      System.out.println("This Num is not Prime");
    }
    else{
      System.out.println("Wrong condition in for loop");
    }
   
    }
  }
}
