package Day10.MultiDimensional;

// import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayLoopInput {
    static void looping(){
        int [][] arr = new int[3][5];

        /*
        arr.length  =  number of rows
        arr[row].length = row chi length i.e total col.
        */




       try (Scanner sc = new Scanner(System.in)) {
           //input
           for (int row = 0; row < arr.length ; row++) {
               for (int col = 0; col < arr[row].length; col++) {
                   arr [row]  [col] = sc.nextInt();
               }
           }
           //output
           for (int row = 0; row < arr.length ; row++) {
               for (int col = 0; col < arr[row].length; col++) {
                   System.out.print(arr [row] [col]+" ");
               }
               System.out.println();//for new linee
           }
       }

    }

    public static void main(String[] args) {

     looping();
    }
}
