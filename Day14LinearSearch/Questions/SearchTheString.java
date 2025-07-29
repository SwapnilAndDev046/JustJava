package Day14LinearSearch.Questions;

import java.util.Scanner;

public class SearchTheString {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String[] names = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Judy" };
            String name = in.next();
            System.out.println(searchString(names, name));
        }
    }
    static String searchString(String [] names,String name){
        for (String ele : names) {
            if (name.equals(ele)) {
                return "Element is present.";
            }
        }
        return "Element is not Present!!!";
    }
}
