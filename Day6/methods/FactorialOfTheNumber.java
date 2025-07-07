package Day6.methods;
import java.util.Scanner;
public class FactorialOfTheNumber {
  static int Factorial(int n){
    int Fact=1;
    for(int i=1;i<=n;i++){
       Fact = Fact*i;//External var needed initially it is 1 
       //so we can easily find products of all the numbers
    }
    return Fact;
  }
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
      System.out.println("Enter the number");
      int n =  sc.nextInt();
      System.out.println("The Factorial of the Number "+n+" is "+Factorial(n));
    }
  }
}
