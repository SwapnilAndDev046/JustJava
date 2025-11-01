

import java.util.*;

public class primeOrNot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number:");
            int num = sc.nextInt();
            prime(num);
            if (prime(num)) {
                System.out.println("it's a prime");
            }
            else{
                System.out.println("it's not prime ");
            }
        }
    }

    static boolean prime(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } 
        else{
            return false;
        }
    }
}
