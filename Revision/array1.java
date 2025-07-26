package Revision;

public class array1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5 };
        System.out.println("Sum is: "+sum(array));
        System.out.println("Mul is: "+mul(array));
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
       return sum;
    }
      static int mul(int[] array) {
        int mul = 1;
        for (int index = 0; index < array.length; index++) {
            mul = mul * array[index];
        }
       return mul;
    }
}
