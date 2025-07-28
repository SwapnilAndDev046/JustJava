package Day13MostIMPForArray.ArrayQuestions;
//parallel two pointer pattern
import java.util.Arrays;

public class zeroInTheEnd {
    public static void main(String[] args) {
        int [] arr = {1,1,3,0,7,0,4,3,0};
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            
            if (arr[right]!=0) {
                //swaps arr[left] and arr[right] when arr[right]!=0
                int temp = arr[right];
                arr[right] =arr[left];
                arr[left] = temp;
                System.out.println(Arrays.toString(arr));
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
[1, 1, 3, 0, 7, 0, 4, 3, 0]
[1, 1, 3, 0, 7, 0, 4, 3, 0]
[1, 1, 3, 0, 7, 0, 4, 3, 0]
[1, 1, 3, 7, 0, 0, 4, 3, 0]
[1, 1, 3, 7, 4, 0, 0, 3, 0]
[1, 1, 3, 7, 4, 3, 0, 0, 0]
 */
