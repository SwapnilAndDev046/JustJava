package Day1;
import java.util.Scanner;
public class Sum {
  public static void main(String[]args)
{  
  try(Scanner sc = new Scanner (System.in))
  {
  System.out.print("first Number is: ");
  int a = sc.nextInt();//same as input () function in python
   System.out.print("second Number is: ");
   int b = sc.nextInt();

  int sum = a+b;

  System.out.println("Answer is: "+sum);
}
  }

}
