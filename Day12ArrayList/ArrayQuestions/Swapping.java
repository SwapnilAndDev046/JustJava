package Day12ArrayList.ArrayQuestions;

import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,435,45,5454,544,545,55,34};
        swap(arr,1,2);
    }

    static void swap(int [] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
