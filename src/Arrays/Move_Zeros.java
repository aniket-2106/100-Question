package Arrays;

import java.util.Arrays;

public class Move_Zeros {
    public static void main(String[] args) {
        //Move All the zero of the array element at the end
        int []nums = {0,1,0,3,12};
        int count=0;

        for (int i = 0;i<nums.length; i++){
            if(nums[i]==0){
                count --;
            }else if(count>0){
                int temp=nums[i];
                nums[i]=0;
                nums[i-count]=temp;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
