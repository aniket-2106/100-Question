package Arrays;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int[] nums ={7,8,10,9,12};

        findElement(nums);

    }
    public static int findElement(int[] nums){
       int start = 0;
       int end = nums.length - 1;

       while (start < end){
           int m1 = (start + end) /2;
           int m2 = m1 + 1;

           if(nums[m1] < nums[m2]){
               start = m2;
           }else {
               end = m1;
           }
       }
       return start;
    }
}


