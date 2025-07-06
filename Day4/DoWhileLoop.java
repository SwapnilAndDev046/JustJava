package Day4;

import java.util.*;

public class DoWhileLoop {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int num = sc.nextInt();
      if (num > 0) {
        System.out.println("num is positive");
      } else if (num == 0) { 
        System.out.println("non -ve non +ve");
      } else {
        do {
          System.out.println("try again!");
          num = sc.nextInt();
        } while (num < 0);
      }

    }
  }
}
