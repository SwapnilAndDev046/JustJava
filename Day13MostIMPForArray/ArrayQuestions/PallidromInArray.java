package Day13MostIMPForArray.ArrayQuestions;

public class PallidromInArray {
    public static void main(String[] args) {
        int [] arr = {1,4,3,3,4,1};
        if (isPallindrome(arr)) {
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }

    }
    static boolean isPallindrome(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            if (arr[start]==arr[end]) {
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
