package Arrays;

public class Minimun_Size_Subarr_Sum {
    public static void main(String[] args) {
//        Input: target = 7, nums = [2,3,1,2,4,3]
//        Output: 2
//        Explanation: The subarray [4,3] has the minimal length under the problem constraint.
        int [] nums =  {2,3,1,2,4,3};
        int target  = 7;
        System.out.println(minSubArray(nums,target));
    }
    public static int minSubArray(int[] nums, int target){
        //basecase for the null input
        if(nums == null || nums.length == 0) return 0;

        int start = 0, end = 0,sum = 0;
        int min = Integer.MAX_VALUE;//2147483647

        while (end < nums.length)
        {
            sum = sum + nums[end];
            end++;

            while (sum >= target)
            {
                min = Math.min(min, (end - start));//compare two value which is minimun
                sum = sum - nums[start];
                start++;
            }
        }
        //if min == Integer.MAX_VALUE true then return min
        //else return 0
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
