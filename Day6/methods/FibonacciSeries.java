package Day6.methods;
import java.util.*;
public class FibonacciSeries {
  static void Fibonacci(int n1,int n2,int n){
    for(int i=1;i<=n-2;i++){
      int n3 = n1+n2;
      n1=n2;
      n2=n3;
      System.out.print(n3+" ");
    }
  }
  public static void main(String[] args) {
    try(Scanner sc =new Scanner(System.in)){
      int n1 = 0;
      int n2 = 1;
      System.out.print("Enter the number:");
      int n = sc.nextInt();
      System.out.print("the Series is:"+n1+" "+n2+" ");
      Fibonacci(n1, n2, n);
    }
  }
}
