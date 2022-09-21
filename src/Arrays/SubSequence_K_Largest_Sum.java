package Arrays;

//Input: nums = [2,1,3,3], k = 2
//        Output: [3,3]
//        Explanation:
//        The subsequence has the largest sum of 3 + 3 = 6.

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SubSequence_K_Largest_Sum {
    public static void main(String[] args) {
        int[] nums = {2,1,3,3};
        int k  = 2;
        System.out.println(subsqquenceSum(nums,k));
    }

    public static int[] subsqquenceSum(int[] nums, int k) {
        //declaring the MIN QUEUE
        //(a,b) -> (a[0] - b[0]) Lambda Expression For MIN QUEUE
        PriorityQueue<int[]> minH = new PriorityQueue<int[]>((a,b) -> ( a[0] - b[0]));
        int  n = nums.length;
        for (int i = 0; i <n ; i++)
        {
            //addind the number and the index in the queue
            minH.offer(new int[]{nums[i],i});
            if(minH.size() > k){
                minH.poll();
            }

        }
        //Declaring HashSet For storing
        Set<Integer> index = new HashSet<Integer>();

        //Adding queue index top array
        while (!minH.isEmpty())
        {
            int []top = minH.poll();
            index.add(top[1]);
        }
        //Adding queue index top array
        int[] ans = new int[k];
        int p = 0;
        for (int j = 0; j < nums.length; j++)
        {
            if(index.contains(j)){
                ans[p]= nums[j];
                p++;
            }
        }
        return ans;
    }
}
