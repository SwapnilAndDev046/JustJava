package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInput1D {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int [] arr = new int[5];
            System.out.println("enter values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        }
    }
}
