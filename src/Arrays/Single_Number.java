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

        //Using HashSet with o(n) time and space complexity
//        Set <Integer> HS = new HashSet<>();
//        int n = nums.length;
//        for (int i = 0; i < n ; i++) {
//            if(HS.contains(nums[i])){
//                HS.remove(nums[i]);
//            }else {
//                HS.add(nums[i]);
//
//            }
//        }
//        return  HS.toArray(new Integer [1])[0]; //for converting the hashset into array
//        [1] is number of element stored in the new array
//        [0] is the index

    }
}
