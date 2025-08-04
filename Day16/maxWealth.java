package Day16;

public class maxWealth {
    public static void main(String[] args) {
        int [] [] accounts ={
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };
        System.out.println("Maximum Addition of the row is:"+MaxWealth(accounts));
    }
    static int  MaxWealth(int [] [] nums){
        int max = Integer.MIN_VALUE;
        for (int[] row : nums) {
            int sum =0;
            for (int col : row) {
                sum = sum + col;
            }
            if (max<sum) {
                max = sum;
            }
        }
        return max;
        
    }
}
