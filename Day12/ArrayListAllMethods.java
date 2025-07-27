package Day12;

import java.util.ArrayList;

public class ArrayListAllMethods {
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

        System.out.println("14 is present true or false: "+list.contains(14));//present true or false

        list.remove(6);//removes element at index next element get that index

        list.remove(Integer.valueOf(18));//removes element by naming it in that paranthesis

        list.set(5,69);//replace the element at at that index with new

        System.out.println("gives element present at that index: "+list.get(5));//gives element present at that index

        System.out.println("Size Of ArrayList: "+list.size());

        System.out.println("Whole ArrayList: "+list);//prints the list

        System.out.println("Tell List Empty or not true or false: "+list.isEmpty());

        list.clear();//clear all the list

        System.out.println("Cleared List: "+list);
    }
}
