package Day21;

import java.util.LinkedList;

public class ceilingCharacter {
    static char CeilingCharacter(LinkedList <Character> ch,char target){
        int low  = 0;
        int high = ch.size()-1;
        while (low<=high) {
            int mid = low+(high-low)/2;
            if (ch.get(mid)==target) {
                return ch.get(mid+1);
            }else if (ch.get(mid)<target) {
                low = mid +1;
            }else if (ch.get(mid)>target) {
                high= mid-1;
            }
        }
        if (ch.get(ch.size()-1)<target) {
            return ch.get(0);
        }
        return ch.get(low);
    }
    public static void main(String[] args) {
        LinkedList <Character> ch = new LinkedList<>();
        for (char index = 'x'; index <= 'y'; index++) {
            ch.add(index);
        }
        char target = 'z';
        System.out.println("Ceilling of "+target+" in list is "+CeilingCharacter(ch,target));
    }
}
