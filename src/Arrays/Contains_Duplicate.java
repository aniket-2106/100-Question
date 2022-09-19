package Arrays;

import java.util.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
     int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(duplicateNumber(nums));
    }
    public static boolean duplicateNumber(int[] nums){
        if(nums == null || nums.length == 0) {
            return false;
        }
        Set <Integer> HS = new HashSet<>();//creating the HashSet
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(!HS.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
