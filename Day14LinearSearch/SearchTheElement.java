package Day14LinearSearch;

import java.util.Scanner;

public class SearchTheElement {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] arr = { 12, 212, 23, 32, 44, 45, 12, 4, 56, 8 };
            System.out.print("Enter The number you Want to Search:");
            int x = in.nextInt();
            if (search(arr, x)) {
                System.out.println("present");
            } else {
                System.out.println("num not present");
            }
        }
    }
    static boolean search(int[] arr, int x) {
        for (int i : arr) {
            if (i == x) {
                return true;
            } 
        }
        return false;
    }

}
