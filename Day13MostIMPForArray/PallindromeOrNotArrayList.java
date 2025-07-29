package Day13MostIMPForArray;

import java.util.ArrayList;
import java.util.Scanner;

public class PallindromeOrNotArrayList {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                list.add(in.nextInt());
            }
            if (isPallindrome(list)) {
                System.out.println("It's pallindrome");
            } else {
                System.out.println("It's not a pallindrome");
            }
        }
    }

    static boolean isPallindrome(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if (list.get(end) == list.get(start)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
