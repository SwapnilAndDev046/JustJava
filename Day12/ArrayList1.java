package Day12;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(6);//Used to add element
        list.add(12);
        list.add(7);
        list.add(14);
        list.add(8);
        list.add(16);
        list.add(9);
        list.add(18);
        System.out.println(list.contains(14));//present true or false
        list.remove(6);//removes element at index next element get that index
        list.remove(Integer.valueOf(18));
        list.set(5,69);//replace the element at at that index with new
        System.out.println(list.get(5));//gives element present at that index
        System.out.println(list);//prints the list
    }
}
