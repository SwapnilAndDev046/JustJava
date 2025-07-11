package Day8.Imp;

import java.util.Arrays;

public class AllStringMethods {
    static String name = "Swapnil";
    static void whereIsChar(){
        System.out.println(name.charAt(4));// on index what is present
    }
    static void length() {
        System.out.println(name.length());//7
    }
    static void LowerCase(){
        System.out.println(name.toLowerCase());//swapnil
    }
    static void UpperCase(){
        System.out.println(name.toUpperCase());//SWAPNIL    
    }
    static void Stringtoarray(){
        System.out.println(Arrays.toString(name.toCharArray()));//['S','w','a'....'l']
    }
    static void trimming(){
        System.out.println("non Strip:"+"         roomMenAao    ");
        System.out.println("strip:"+"         roomMenAao    ".trim());//roomMeinAao
    }
    static void substringINString(){
        System.out.println(name.substring(3,5));//pni
    }
    static void replacing(){
        System.out.println(name.replace("wa", "o"));
    }
    static void startswithWord(){
        System.out.println(name.startsWith("Swap"));//boolean return
    }
    static void indexofTheChar(){
        System.out.println(name.indexOf('w'));//1
    }
    static void lastIndexing(){
        System.out.println(name.lastIndexOf("pnil"));
    }

    public static void main(String[] args) {
        whereIsChar();// on what index what char is there 
        length();//length
        indexofTheChar();// find index of given character indexOf(char name, from this index)
        LowerCase();
        UpperCase();
        Stringtoarray();//convert string to array
        trimming();//remove the spaces
        substringINString();// name.substring(startindex,endindex)
        replacing();//name.replace(old char, new char)
        startswithWord();//true or false   same way endsWith
        lastIndexing();// same char asel tar tyacha last presence cha index.
        

    }
}
