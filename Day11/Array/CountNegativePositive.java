package Day11.Array;

import java.util.Arrays;

public class CountNegativePositive {
    public static void main(String[] args) {
        int[] arr = {12, 32, -3, -32, 232, 43, 43, -2, 323, 323, -434, -323, 4, 43, -4, 34, -443, -3, -3, 3, 565, -4, -346, 45, 44};
        int length = arr.length;
        System.out.println(Arrays.toString(arr));
        int c1=0;
        int c2=0;
        for (int i = 0; i <length ; i++) {
            if (arr[i]>0){
                c1++;
            }
            else{
                c2++;
            }
        }
        System.out.println("+ve: "+c1);
        System.out.println("-ve: "+c2);
    }
}
