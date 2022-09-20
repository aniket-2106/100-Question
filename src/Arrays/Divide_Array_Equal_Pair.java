package Arrays;

import java.util.Arrays;

public class Divide_Array_Equal_Pair {
    public static void main(String[] args) {
        int []nums = {3,2,3,2,2,2};
        System.out.println(divideEqual(nums));
    }

    private static boolean divideEqual(int[] nums) {
        Arrays.sort(nums);
        int pair = nums.length / 2;
        int counter=0;
        for (int i = 1; i < nums.length; i+=2) {
            if(nums[i] == nums[ i -1]){
                counter++;
            }
            if(counter == pair){return true;}
        }
        return false;
    }

}
