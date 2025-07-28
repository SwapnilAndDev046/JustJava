package Day12ArrayList.ArrayQuestions;

public class maxElementInTheArray {
    public static void main(String[] args) {
       int [] arr = {198, 85, 12, 63, 49, 91, 5, 78, 30, 99, 14, 52, 21, 70, 43};
       MaxElement(arr,arr[0]); 
    }
    static void MaxElement(int [] arr,int max){
        for (int i : arr) {
            if (max<i) {
              max = i;  
            }
        }
        System.out.println(max);
    }
}
