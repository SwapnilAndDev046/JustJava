package Day1;
import java.util.*;
public class SwitchCase {
  public static void main(String[]args){
    try(Scanner sc = new Scanner (System.in)){
      System.out.println("Check Armstrong\n 1.3 Digit\n 2.4 Digit\n");
      System.out.print("Enter how many digit want to check: ");
      int T = sc.nextInt();
      switch (T) {
      
        case 1:
          System.out.println("Enter three digit Number");
          int n = sc.nextInt();
          int D1 = n/100;
          int D2 = (n%100)/10;
          int D3 = n%10;
          int n1= D1*D1*D1;
          int n2=D2*D2*D2;
          int n3 = D3*D3*D3;

          if(n1+n2+n3==n){
            System.out.println("Armstrong");
          }
          else{
            System.out.println("Not armstrong!");
          }
          break;

        case 2:
          System.out.println("Enter four digit Number");
          n = sc.nextInt();
          D1=n/1000;
          D2=((n%1000)/100);
          D3=((n%1000)%100)/10;
          int D4 = ((n%1000)%100)%10;
          n1 = D1*D1*D1*D1;
          n2 = D2*D2*D2*D2;
          n3 = D3*D3*D3*D3;
          int n4 = D4*D4*D4*D4;

          if(n1+n2+n3+n4==n){
            System.out.println("armstrong");
          }
          else{
            System.out.println("Not armstrong!!");
          }
          
          break;

        default:
          System.out.println("wrong input!!");
          break;
      }
    }
  }
}
