

import java.util.Arrays;

public class reverseTheArray {
    public static void main(String[] args) {
        int [] arr = {198, 85, 12, 63, 49, 91, 5, 78, 30, 99, 14, 52, 21, 70, 43};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            System.out.println(Arrays.toString(arr));
        }
    }
}
/*

[43, 85, 12, 63, 49, 91, 5, 78, 30, 99, 14, 52, 21, 70, 198] =1
[43, 70, 12, 63, 49, 91, 5, 78, 30, 99, 14, 52, 21, 85, 198] =2
[43, 70, 21, 63, 49, 91, 5, 78, 30, 99, 14, 52, 12, 85, 198] =3
[43, 70, 21, 52, 49, 91, 5, 78, 30, 99, 14, 63, 12, 85, 198] =4
[43, 70, 21, 52, 14, 91, 5, 78, 30, 99, 49, 63, 12, 85, 198] =5
[43, 70, 21, 52, 14, 99, 5, 78, 30, 91, 49, 63, 12, 85, 198] =6
[43, 70, 21, 52, 14, 99, 30, 78, 5, 91, 49, 63, 12, 85, 198] =7

 */