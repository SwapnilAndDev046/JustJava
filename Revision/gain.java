package Revision;


public class gain {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain));
    }

    static int  largestAltitude(int[] gain) {
        int n = gain.length;
        int[] ans = new int[n + 1];
        ans[0] = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + gain[i];
            ans[i] = sum;
        }
        
        int max = Integer.MIN_VALUE;
        for (int i : ans) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
