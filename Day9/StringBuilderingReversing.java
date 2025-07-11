package Day9;
import java.util.*;
public class StringBuilderingReversing  {
  static void revering(String sc){
    sc = sc.toLowerCase();
    StringBuilder s = new StringBuilder();
 s.append(sc);
    
    // System.out.println(s);
    StringBuilder r = new StringBuilder();
    r.append(sc).reverse();
    
    if (s.toString().equals(r.toString())) {
      System.out.println("Pallindrome");
    }
    else{
      System.out.println("Not Pallindrome");
    }
  }
  public static void main(String[] args) {
    try(Scanner Sc = new Scanner(System.in)){
      System.out.print("Enter the String:");
      String sc = Sc.next();
    // sc =  sc.toLowerCase();
      revering(sc);
    }
   
  }
}
