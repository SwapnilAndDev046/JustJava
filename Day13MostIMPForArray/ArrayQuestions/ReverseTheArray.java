package Day13MostIMPForArray.ArrayQuestions;

// import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9};
        reverse2(arr);// Empty String
        reverse(arr);// two pointer (converging)
    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;
        // directly affecting array
        while (end>start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Using Converging two pointers: "+Arrays.toString(arr));
    }
    static void reverse2(int []arr){
        int  n = arr.length-1;
        String s = "";
         for (int i = n; i >= 0; i--) {
           s = s +" "+ arr[i];
        }
        System.out.println("Using Empty String: "+s);
      
    }
}
