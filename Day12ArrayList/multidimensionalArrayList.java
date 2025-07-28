package Day12ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class multidimensionalArrayList {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            // initialization of inside ArrayList
            // means create the small empty arraylist in main arraylist
            // [[], [], []] like this
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());// creates: [[], [], []]
            }
            System.out.println("Initially empty: " + list);
            // add elements
            // outter loop means the no. rows in main arraylist
            for (int i = 0; i < 3; i++) {
                // inner loop means the short arraylist inside main arraylist column no.

                for (int j = 0; j < 3; j++) {
                    list.get(i).add(in.nextInt());
                }
            }
            System.out.println("After filling: " + list);
        }
    }
}

/* OUTPUT:
 Initially empty: [[], [], []]
 1
 2
 3
 4
 5
 6
 7
 8
 9
 After filling: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 */