package Day10.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    static void StringInsideArray(){
        try (Scanner sc = new Scanner(System.in)) {
            String [] str = new String[5];
            System.out.print("Enter the Strings For printing it inside the Array:");
            for (int i = 0; i <str.length ; i++) {
                str[i] = sc.next();
            }
            for (String i : str){
                System.out.print(i+" ");
            }
            System.out.println("\n"+Arrays.toString(str));
        }

    }
    public static void main(String[] args) {
    StringInsideArray();
    }
}
