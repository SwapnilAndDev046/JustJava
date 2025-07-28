package Day13.ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9};
        // reverse(arr);
        reverse2(arr);
        // System.out.println(Arrays.toString(arr));
      
    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (end>start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void reverse2(int []arr){
        int  n = arr.length-1;
        ArrayList <Integer> list = new ArrayList<>();
         for (int i = n; i < 0; i--) {
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
