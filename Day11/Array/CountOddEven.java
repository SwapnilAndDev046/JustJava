package Day11.Array;

public class CountOddEven {
    public static void main(String[] args) {
        int[] arr = {1, 324, 54, 5, 343, 45, 6, 5, 323, 3, 54, 3, 434, 45, 43, 45, 4, 5, 67, 8, 8898, 86, 4, 33, 3, 4466, 87, 98};
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("then number of evens in this array is :"+count1);
        System.out.println("then number of odd in this array is :"+count2);
    }
}
