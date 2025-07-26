package Revision;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();//153
            int first = (n / 100) * (n / 100) * (n / 100);// 1
            int middle = ((n % 100) / 10) * ((n % 100) / 10) * ((n % 100) / 10);// 5
            int last = (n % 10) * (n % 10) * (n % 10);// 3
            if (first + middle + last == n) {
                System.out.println("it's a armstrong");
            } else {
                System.out.println("bullshit");
            }
        }
    }
}