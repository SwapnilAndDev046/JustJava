package Day3;
import java.util.*;
/* 
 
 */
public class Pattern5 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)){
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
        //space
        for(int j=1;j<=i-1;j++){
          System.out.print("-");
        }
        //star
        for(int j=1;j<=2*(n-i)+1;j++){
          System.out.print("*");
        }
        //space
        for(int j=1;j<=i-1;j++){
          System.out.print("-");
        }
        System.out.println();
      }
    } 
  }
}
