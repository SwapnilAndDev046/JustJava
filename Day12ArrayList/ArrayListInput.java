package Day12ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInput {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>(5);

            // input
            for (int i = 0; i < 5; i++) {
                list.add(in.nextInt());
            }
            //output
            for (int i = 0; i < 5; i++) {
                System.out.print(list.get(i)+" ");
            }
            //output
            System.out.println("\n"+list);
        }
    }
}
