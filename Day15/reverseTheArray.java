package Day15;

import java.util.ArrayList;

public class reverseTheArray {
    public static void main(String[] args) {
        int [] arr = {12,32,43,45,3,2,21,54,76};
        System.out.println(reverseArray(arr));
    }
    static ArrayList<Integer> reverseArray(int [] arr){
        ArrayList <Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        int start = 0;
        int end = list.size()-1;
        while (start<end) {
            int temp = list.get(start);
            list.set(start, list.get(end));//sets the start to end using set() method
            list.set(end, temp);
            start++;
            end--;
        }
        return list;
    }
}
