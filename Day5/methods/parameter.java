package Day5.methods;
import java.util.Scanner;
public class parameter {

  static int sum(int a,int b){
    int sum = a+b;
    return sum;
  }

  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
    int a = sc.nextInt();
    int b = sc.nextInt();
    int input = sum(a,b);
    System.out.println("Sum Of Two Numbers are: "+input);
    }
  }
}
