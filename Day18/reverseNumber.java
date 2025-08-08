package Day18;

public class reverseNumber {
    public static void main(String[] args) {

        int x = 121;
        System.out.println("revere Number we get:" + revNum(x));

    }

    static int revNum(int x) {
        int revere = 1;
        while (x > 0) {
            int lastDigit = x % 10;
            revere = revere * 10 + lastDigit;
        }
        return revere;
    }
}
