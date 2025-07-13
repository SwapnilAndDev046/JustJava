package Day11.Array;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={48,2,4,35,23,45};
        int max=arr[0];
        int max2=arr[1];
        for (int i = 0; i < arr.length ; i++) {
            if (max<arr[i]){
                max2=max;
                max=arr[i];
            }
        }
        System.out.println(max2);
    }
}
