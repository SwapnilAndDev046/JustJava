package Day11.Array;

import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        int[] a = {543,54,34,2,4,25,5,6,7676,2};
        System.out.println(Arrays.toString(a));
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum = sum+a[i];
        }
        System.out.println("Average of the Array is "+average(sum,a));
    }
    static float average(int sum,int[] a){
        float avg = (float) sum /(float) a.length;
        return avg;
    }
}
