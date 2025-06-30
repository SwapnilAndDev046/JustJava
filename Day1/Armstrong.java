package Day1;
import java.util.*;
public class Armstrong {
 public static void main(String[]args){
   try(Scanner sc = new Scanner(System.in)){
    System.out.println("please take 3 digit number: ");
    int n = sc.nextInt();
    if(99<n && n<1000){
      int D1 = n/100;//first digit
      int D2 = (n%100)/10;//second digit
      int D3 = n%10;//third digit 
      int n1 = D1*D1*D1;
      int n2 = D2*D2*D2;
      int n3 = D3*D3*D3;

      if(n1+n2+n3==n){
        System.out.println("Number is Armstrong Number!");
      }
      else{
        System.out.println("Number is not ArmStrong Number!");
      }
    }
    else{
      System.out.println("wrong input");
    }
  }
 }
}
