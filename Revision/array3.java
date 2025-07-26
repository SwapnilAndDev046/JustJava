package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String [] group = new String[4];
        for(int index=0;index<group.length;index++){
            group[index] = sc.next();
        }
        System.out.println(Arrays.toString(group));
        }
    }
}
