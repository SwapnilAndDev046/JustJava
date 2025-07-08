package Day7.Strings;

public class stringComparison {
    public static void main(String[] args) {
        System.out.print("Same in the heap memory?");
        Method1();
        System.out.print("Same in the heap memory?");
        Method2();
    }

    static void Method1() {
        String a = "swapnil";
        String b = "swapnil";
        System.out.println(a ==b);// true
        //two variable pointing same object in heap memory

    }

    static void Method2() {
        // creating the new object for same value
        //both are outside (pool)
        String a = new String("swapnil");
        String b = new String("swapnil");
        System.out.println(a == b);//false compares pool
        System.out.println(a.equals(b));// compares value True
    }
}
