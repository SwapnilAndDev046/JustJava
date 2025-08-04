package Day17;



public class returnEvenDigitCount {
    public static void main(String[] args) {
        int [] nums = {21,233,32,23114,32,5432,965141};
        System.out.println(Count(nums));
    }
    static int  Count(int[] nums){
        int count= 0;
        for (int i : nums) {
           int count2=0;
           while (i>0) {
            i =i/10;
            count2++;
           }
           if (count2%2==0) {
            count++;
           } 
        }
        return count;
    }
}
