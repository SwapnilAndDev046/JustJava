package Day1;
import java.util.*;
public class Fibonacci {
 public static void main(String[]args) {
  try(Scanner sc = new Scanner (System.in)){
    int n1=0;
    int n2=1; 
    int n3;
    System.out.print("enter Series Size: ");
    int Total = sc.nextInt();
    System.out.print(n1+" "+n2);
    for(int i = 1; i<=Total-2;i++ ){
      n3 = n1+n2;
      n1=n2;
      n2=n3;
      System.out.print(" "+n3);
    }
  }
}
}
