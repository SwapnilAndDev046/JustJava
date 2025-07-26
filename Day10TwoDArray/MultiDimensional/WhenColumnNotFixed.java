package Day10TwoDArray.MultiDimensional;

import java.util.Arrays;

//When column size varies 
public class WhenColumnNotFixed {
public static void main(String[] args) {
        int [] [] arr = {
        {1,2,3},
        {4,5},
        {6,7,8,9}
    };
    
    //output1
    for (int row = 0; row < arr.length; row++) {
         System.out.println(Arrays.toString(arr[row]));
    }

    //output2
    System.out.println("\n");
    for (int row = 0; row < arr.length; row++) {
        for (int column = 0; column < arr[row].length; column++) {
            System.out.print(arr[row][column]+" ");
        }
        System.out.println();
    }
}
}
