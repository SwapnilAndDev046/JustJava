package Day4;

public class reverseTheDigit {
  public static void main(String[] args) {
    int n = 1234;
    int reverseDigit = 0;
    while (n > 0) {
      int last_digit = n % 10;
      reverseDigit = reverseDigit * 10 + last_digit;
      n = n / 10;// increment || Decrement
    }
    System.out.println(reverseDigit);

  }
}
