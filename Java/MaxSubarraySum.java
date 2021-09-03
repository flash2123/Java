import java.util.Arrays;
import java.util.Scanner;
public class MaxSubarraySum {
    public static int[] takeInput(){
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n;i++){
                arr[i]=s.nextInt();
            }
            return arr;
        }
        public static int maxSubArray(int[] nums) {
 
        //     int n = nums.length;
        //     int maximumSubArraySum = Integer.MIN_VALUE;
        //     int start = 0;
        //     int end = 0;
    
        //     for (int left = 0; left < n; left++) {
    
        //         int runningWindowSum = 0;
    
        //         for (int right = left; right < n; right++) {
        //             runningWindowSum += nums[right];
    
        //             if (runningWindowSum > maximumSubArraySum) {
        //                 maximumSubArraySum = runningWindowSum;
        //                 start = left;
        //                 end = right;
        //             }
        //         }
        //     }
        //     logger.info("Found Maximum Subarray between {} and {}", start, end);
        //     return maximumSubArraySum;
        // }

        
    // public static int maxSubArraySum(int arr[], int n, int k){
    //     if (n < k)
    //     {
    //        System.out.println("Invalid");
    //        return -1;
    //     }
      
    //     // Compute sum of first window of size k
    //     int res = 0;
    //     for (int i=0; i<k; i++)
    //        res += arr[i];
      
    //     // Compute sums of remaining windows by
    //     // removing first element of previous
    //     // window and adding last element of
    //     // current window.
    //     int curr_sum = res;
    //     for (int i=k; i<n; i++)
    //     {
    //        curr_sum += arr[i] - arr[i-k];
    //        res = Math.max(res, curr_sum);
    //     }
      
    //     return res;
    // }
    //     int bestSum = Integer.MIN_VALUE;
    //     int currentSum = 0;
        
    //     for(int i = 0; i<nums.length; i++){
    //         currentSum = Math.max(nums[i], currentSum+nums[i]);
    //         bestSum = Math.max(bestSum, currentSum);
    //     }
    //     return bestSum;
    // }


    //     int size = a.length;
    //     int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
    //     for (int i = 0; i < size; i++){
    //         max_ending_here = max_ending_here + a[i];
    //         if (max_so_far < max_ending_here)
    //             max_so_far = max_ending_here;
    //         if (max_ending_here < 0)
    //             max_ending_here = 0;
    //     }
    //     return max_so_far;
    // }

    // int max = Arrays.stream(A).max().getAsInt();
 
    //     // if the array contains all negative values, return the maximum element
    //     if (max < 0) {
    //         return max;
    //     }
 
    //     // stores the maximum sum subarray found so far
    //     int maxSoFar = 0;
 
    //     // stores the maximum sum of subarray ending at the current position
    //     int maxEndingHere = 0;
 
    //     // do for each element of the given array
    //     for (int i: A)
    //     {
    //         // update the maximum sum of subarray "ending" at index `i` (by adding the
    //         // current element to maximum sum ending at previous index `i-1`)
    //         maxEndingHere = maxEndingHere + i;
 
    //         // if the maximum sum is negative, set it to 0 (which represents
    //         // an empty subarray)
    //         maxEndingHere = Integer.max(maxEndingHere, 0);
 
    //         // update the result if the current subarray sum is found to be greater
    //         maxSoFar = Integer.max(maxSoFar, maxEndingHere);
    //     }
 
    //     return maxSoFar;
    // }
 
    public static void main(String[] args) {
        int[] arr=takeInput();
        // int arr[] = {1,2,3,4};
        // int k = arr.length;
        // int n = arr.length;
        // int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums =;
        System.out.println(maxSubArray(nums));
        
    }
    
}
