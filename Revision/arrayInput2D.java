

import java.util.Arrays;
import java.util.Scanner;

public class arrayInput2D {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
         int [] [] arr = new int[2][2];
         //input
        for (int row = 0; row < arr.length; row++) {
            //arr[row].length this means the number of no. rows is column e.g [1,2,3,4,4,3] column is 5 from 0
            for (int column = 0; column < arr[row].length; column++) {
                arr[row] [column] = sc.nextInt();
            }
        }
        //output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        //output
        
       }

    }
}
