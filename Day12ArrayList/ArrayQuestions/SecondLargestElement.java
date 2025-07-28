package Day12ArrayList.ArrayQuestions;

// import java.util.Arrays;

public class SecondLargestElement {
    
    public static void main(String[] args) {
        int[] arr = { 198, 198,198 };
        int max = arr[0];
        for (int i :arr) {
           if (max<i) {
            max= i;
           } 
        }
        System.out.println("largest element i array is: "+max);
        int SecondMax = -1;
        for(int i: arr){
            if (SecondMax<i && i!=max) {
                SecondMax = i;
            }
        }
        System.out.println("Second Largest element is: "+SecondMax);

    }
}
