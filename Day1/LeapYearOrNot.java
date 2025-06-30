package Day1;
import java.util.Scanner;
public class LeapYearOrNot {
  public static void main(String[]args)
  { 
    try(Scanner sc = new Scanner(System.in)){
    System.out.print("Write the Checking Year: ");
    int Year= sc.nextInt();
    if(Year%4==0 && Year%100 == 0 && Year%400==0 || Year%4==0 && Year%100!=0){
      System.out.print("It's a Leap Year");
    }
    else{
      System.out.println("It is not Leap Year");
    }
    }
  } 
}
