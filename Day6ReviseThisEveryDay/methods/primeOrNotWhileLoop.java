package Day6ReviseThisEveryDay.methods;

import java.util.*;

public class primeOrNotWhileLoop {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      if (prime(n)) {
        System.out.println("prime");
      } else {
        System.out.println("composite");
      }
    }
  }

  static boolean prime(int n) {
    if (n <= 1) {
      return false;// not prime
    }
    int c = 2;
    if (c * c > n) {
      return true;// prime
    }
    while (c * c <= n) {
      if (n % c == 0) {
        return false;// not prime
      }
      c++;
    }
    return true;
  }
}
