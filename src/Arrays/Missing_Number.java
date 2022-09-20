package Arrays;

public class Missing_Number {
    //USING THE CARL GAUSS TECHNIQUE
    //N(N+1)/2
    public static void main(String[] args) {
            int []a ={3,0,1};
            System.out.println(missingNumber(a));
        }
        public static int missingNumber(int[] nums) {
            int n = nums.length;
            int expectedTotal = (n*(n+1))/2;
            int total=0;
            for(int num:nums){
                total += num;
            }
            return expectedTotal - total;
        }
}



