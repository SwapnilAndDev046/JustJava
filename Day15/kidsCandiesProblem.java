package Day15;

import java.util.ArrayList;
import java.util.List;

public class kidsCandiesProblem {
    public static void main(String[] args) {
        int[] candies = { 1, 2, 5, 3, 2, 6 };
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> result = new ArrayList<>();
        int max= candies[0];
        for (int i : candies) {
            if (max<i) {
                max = i;
            }
        }
        for (int j : candies) {
            int target = 0;
            target = j+extraCandies;
            if (target>=max) {
                result.add(true);
            }else{
                result.add(false);
            }
            
        }
        return result;
    }
}
/*
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: The current max value is 5 which is held by Kid 3

Kid 1, they will have 2 + 3 = 5 candies, which is greater or equal to the current max of 5.
Kid 2, they will have 3 + 3 = 6 candies, which is greater or equal to the current max of 5.
Kid 3, they will have 5 + 3 = 8 candies, which is greater or equal to the current max of 5.
Kid 4, they will have 1 + 3 = 4 candies, which is less than the current max of 5.
Kid 5, they will have 3 + 3 = 6 candies, which is greater or equal to the current max of 5.
 */