package Day16;

import java.util.Scanner;

public class StringPallindrome {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the String:");
            String str  =  in.next();
            str.toLowerCase();
            System.out.println(solution(str));
        }
    }
    static String solution(String str){
        
        char [] charName = str.toCharArray();
        int start = 0;
       
        int end = charName.length-1;
        while (start<end) {
           char temp = charName[start];
           charName[start]=charName[end];
           charName[end]= temp;
           start++;
           end--;
        }
        String sc = String.valueOf(charName);
        if (str.toLowerCase().equals(sc.toLowerCase())) {
            return "pallindrome";
        }
        else{
            return "Not Pallindrome";
        }
        
    }
}
