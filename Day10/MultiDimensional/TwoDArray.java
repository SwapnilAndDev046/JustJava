package Day10.MultiDimensional;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        /*
        1 2 4
        2 3 4
        1 2 5
       To print sOMETHING lIKE THIS u need the multidimensional array.
        */
//2D array
        int [][] arr =  new int[3][3];
        // int [][] arr1 = {
        //         {1,2,4},
        //         {2,3},
        //         {1,2,5,9}
        // };
        //input
        arr [0] [0] = 1;
        arr [0] [1] = 2;
        arr [0] [2] = 3;
        arr [1] [0] = 4;
        System.out.println(Arrays.toString(arr[0]));
    }
}
