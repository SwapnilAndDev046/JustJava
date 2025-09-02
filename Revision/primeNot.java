package Revision;

import java.util.Scanner;

public class primeNot {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int n = in.nextInt();
            System.out.println("Given number is prime True Or False: "+prime(n));
        }
    }
    static boolean prime(int n){
        int count =0 ;
        for (int i = 1; i <= n; i++) {
           if (n%i==0) {
                count++;
           } 
        }
        if (count>2) {
            return false;
        }
        return true;
    }
}
