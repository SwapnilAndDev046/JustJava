package Day8.Strings;

public class AllStringMethods {
    static String name = "Swapnil";

    static void length() {
        System.out.println(name.length());
    }
    static void LowerCase(){
        System.out.println(name.toLowerCase());
    }
    static void UpperCase(){
        System.out.println(name.toUpperCase());
    }
    static void toStringMethod(){
        Integer num = 34;
        System.out.println(num.toString());
    }

    public static void main(String[] args) {
        length();
        LowerCase();
        UpperCase();

    }
}
