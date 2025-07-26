package Day12;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Long> KB = new ArrayList<>();
        ArrayList<Long> MB = new ArrayList<>();
        ArrayList<Long> GB = new ArrayList<>();
        ArrayList<Long> TB = new ArrayList<>();
        
        long[] arr = { 10, 232, 32434, 3434, 34334, 34, 3434, 34343, 3434, 3, 434, 100000, 93823, 33233, 333343,
                34343, 324, 434, 34, 345475, 4,328728433, 343, 4343, 434, 3324,883749832 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1000) {
                KB.add(arr[i]);
            } else if (1000 <= arr[i] && arr[i] < 1000000) {
                MB.add(arr[i]);
            } else if (1000000 <= arr[i] && arr[i] < 1000000000) {
                GB.add(arr[i]);
            } else if (1000000000 <= arr[i]) {
                TB.add(arr[i]);
            }
        }
        System.out.println("KB files size:"+KB);
        System.out.println("MB files size:"+MB);
        System.out.println("GB files size:"+GB);
        System.out.println("TB files size:"+TB);
    }
}
