

public class SmallestInArray {
    public static void main(String[] args) {
        int [] arr = {198, 85, 12, 63, 49, 91, 5, 78, 30, 99, 14, 52, 21, 70, 43};
        int min = arr[0];
        System.out.println("Smallest ele in array is: "+small(arr,min));
    }
    static int small(int [] arr,int min){
        for (int i : arr) {
            if (min>i) {
                min = i;
            }
        }
        return min;
    }
}
