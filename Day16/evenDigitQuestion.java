package Day16;

public class evenDigitQuestion {
    public static void main(String[] args) {
        int[] nums = { 12, 334, 3233, 14, 54, 3432, 432 };
        System.out.print("the digit with even counting are total "+evenDigit(nums)+" in the Array. ");
    }

    static int evenDigit(int[] nums) {
        int output = 0;
        for (int i : nums) {
            int count = 0;
            while (i>0) {
                i=i/10;
                count++;
            }
            if (count%2==0) {
                output++;
            }
        }
        return output;
    }
}
