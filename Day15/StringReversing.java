package Day15;

public class StringReversing {
    public static void main(String[] args) {
        String name = "madam";
    stringReverse(name);
    }
    static void stringReverse(String name){
        int start = 0;
        int end = name.length()-1;
        char [] charsName  = name.toCharArray();
        while (start<end) {
            char temp = charsName[start];
            charsName[start]=charsName[end];
            charsName[end]=temp;
            start++;
            end--;
        }
        String rev = String.valueOf(charsName);
        if (name.equals(rev)) {
            System.out.println("it's a pallindrome!!");
        }
        else{
            System.out.println("it's not a pallindrome!!");
        }
    }
}
