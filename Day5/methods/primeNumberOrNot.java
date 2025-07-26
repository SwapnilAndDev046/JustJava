package Day5.methods;
import java.util.Scanner;
public class primeNumberOrNot {
  static boolean CheckPrime(int n){
    int count=0;
    
    for(int i=1;i<=n;i++){
      if (n%i==0) {
        count++;
      }
    }
    if (count==2) {
       return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
      System.out.print("enter Number:");
      int n = sc.nextInt();
      boolean result = CheckPrime(n);
      if (result) {
        System.out.println("prime");
      }
      else{
        System.out.println("NotPrime");
      }
    }
  }
}
