package Day11.Array;

import java.util.*;

public class searchElementInArray {
    static void search(int[] searchArr) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(Arrays.toString(searchArr));
            System.out.print("Num you wan to search:");
            int num = sc.nextInt();
            for (int i = 0; i < searchArr.length; i++) {
                if (num == searchArr[i]) {
                    System.out.println("The Num is present at " + i + " index");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 34, 23, 65, 232, 4565, 23, 23, 45, 76, 8, 3, 323, 43, 45, 5, 23};
        search(arr);
    }
}
