package Day2;
import java.util.*;;
public class PrintTheFirstNPrimeNumbers {
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the numbers from x to y");
      System.out.print("Enter X: ");
      int x= sc.nextInt();
      System.out.print("Enter Y: ");
      int y= sc.nextInt();
      System.out.print("Prime numbers from "+x+" to "+y+" are: ");
      int total=0;
      for(int i=x;i<=y;i++){
        int count=0;
        for(int j =1;j<=i;j++){
          if (i%j==0) {
            count++;
          }
        }
        if (count==2) {
          total++;
          System.out.print(i+" ");
        }
      }
      System.out.println("\nThe total Prime Numbers are: "+total);
    }
  }
}
