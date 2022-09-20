package Arrays;
import java.util.*;
public class Product_Of_Array {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(product(nums));
    }
    public static int[] product(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp = tmp *  nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp = tmp * nums[i];
        }
        return result;
    }
}
