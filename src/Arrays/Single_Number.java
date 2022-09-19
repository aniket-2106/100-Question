package Arrays;

public class Single_Number {
    public static void main(String[] args) {
        int[] arr={4,4,2,1,2,};
        System.out.println(countSingle(arr));
    }

    private static int countSingle(int[] nums) {
        int res = 0;
        for (int i: nums){
            res = res ^ i;
        }
        return res;
    }
}
