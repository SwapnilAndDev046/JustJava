package Day14LinearSearch;

import java.util.Scanner;

public class returnIndexOfSearchedElement {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] arr = { 12, 212, 23, 32, 44, 45, 4, 56, 8 };
            System.out.print("which element you want to search by Linear Search:");
            int x = in.nextInt();
            if (linearSearch(arr,x)!=-1) {
                System.out.println("This Element is available at index: "+linearSearch(arr,x));
            }else{
                System.out.println("Element Ain't Present Here!!");
            }
        }
    }
    static int linearSearch(int[]arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                return i;
            }
        }
        return -1;
    }
}
