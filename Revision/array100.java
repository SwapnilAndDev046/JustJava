package Revision;

import java.util.ArrayList;

public class array100 {
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int n = arr.length;
        int high = n - 1;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        //{2,3,4,7,11}
        while (i < arr[high]+k) {
            int count=0;
            int j = 0;
            while ( j < n) {
                if (i != arr[j]) {
                   count++;
                }
                j++;  
            }
            if (count==n) {
                list.add(i);
            }
            i++;
            
        }
        return list.get(k-1);
    }
}
