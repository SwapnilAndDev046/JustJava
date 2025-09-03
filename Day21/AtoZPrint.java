package Day21;

import java.util.ArrayList;
import java.util.List;

public class AtoZPrint {
    public static void main(String[] args) {
        List<Character> ch = new ArrayList<>();
        for (char i = 'c'; i <= 'j'; i++) {
            ch.add(i);
        }
        System.out.println(ch);
    }
}