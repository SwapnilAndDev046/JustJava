package Day1;
import java.util.*;
public class Tables {
  public static void main(String[]args){
    try(Scanner sc = new Scanner (System.in)){
    System.out.println("Which table do u want: ");
    int n = sc.nextInt(); 
    for (int i = 1 ;i<11;i++ ){
      System.out.println(n+"X"+i+"="+(n*i));
    }
 } 
}
}
