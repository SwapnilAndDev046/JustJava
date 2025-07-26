package Revision;
import java.util.*;
public class multipleAttemptTillGetRightAnswer {
    public static void main(String[] args) {
        mul();
    }
    static void mul(){
        try(Scanner sc  = new Scanner(System.in)){
            int n = sc.nextInt();
          while (n>0) {
            if (n%2!=0) {
                System.out.println("try Again!");
                n = sc.nextInt();
            }
            else{
                System.out.println("okay thank you for even num");
                break;
            }
          }  
        }
    }
}
