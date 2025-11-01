

public class LargeInArray {
    public static void main(String[] args) {
        int [] arr = {198, 85, 12, 63, 49, 91, 5, 78, 30, 99, 14, 52, 21, 70, 43};
        int max = -1;
        System.out.println("Largst ele is: "+large(arr,max));
    }
    static int large(int [] arr,int max){
        for(int i:arr){
            if (max<i) {
                max=i;
            }
        }
        return max;
    }
}
