

public class SecondSmallArray {
   public static void main(String[] args) {
    int [] arr = {198, 85, 12, 63, 49, 91, 5, 78, 30, 99, 14, 52, 21, 70, 43};
    int min = arr[0];
    int min2 = arr[0];
    System.out.println("Second mallest ele in an array is: "+SecondSmall(arr,min,min2));
   } 
   static int SecondSmall(int [] arr,int min,int min2){
    for (int i : arr) {
        if (min>i) {
            min = i;
        }
    }
    for (int i : arr) {
        if (min2>i&&i!=min) {
            min2=i;
        }
    }
    return min2;
   }
}
