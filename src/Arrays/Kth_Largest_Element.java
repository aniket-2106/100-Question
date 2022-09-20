package Arrays;

import java.util.PriorityQueue;

public class Kth_Largest_Element {

        public static void main(String[] args) {
//        Input: nums = [3,2,1,5,6,4], k = 2
//        Output: 5
            int [] arr = {3,2,3,1,2,4,5,5,6};
            int k = 4;
            System.out.println(kLargest(arr,k));
        }

        public static int kLargest(int[] arr, int k) {
            PriorityQueue<Integer> minH = new PriorityQueue<>();
            int n = arr.length;
            for (int i = 0; i < n; i++)
            {
                minH.offer(arr[i]);
                if(minH.size() > k){
                    minH.poll();
                }
            }
            return minH.peek();
            //timeComplexity = o(log k);
        }
    }

