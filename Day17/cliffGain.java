package Day17;

public class cliffGain {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(Gain(gain));
    }

    static int Gain(int[] gain){
        //summing of cliffs from zero 
        int n = gain.length;
        int [] ans = new int[n+1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + gain[i];
            ans[i] = sum;
        }
        ans[n]=0;
        int max = Integer.MIN_VALUE;
        for(int  i: ans){
            if (i>max) {
                max = i;
            }
        }
        return max;
    }
}
