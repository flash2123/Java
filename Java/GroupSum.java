public class Solution {

	public static boolean subsetSumToKIdentical(int input[], int n,int k){
        
        if (k == 0)
            return true;
        if (n == 0 && k != 0)
            return false;
 
        // If last element is greater than sum, then ignore
        // it
        if (input[n - 1] > k)
            return subsetSumToKIdentical(input, n - 1, k);
 
        /* else, check if sum can be obtained by any of
           the following
        (a) including the last element
        (b) excluding the last element
        */
        return subsetSumToKIdentical(input, n - 1, k)
            || subsetSumToKIdentical(input, n - 1, k - input[n - 1]);
    }
 
    // Returns true if arr[] can be partitioned in two
    // subsets of equal sum, otherwise false
    static boolean findPartition(int input[], int n){
        // Calculate sum of the elements in array
        int k = 0;
        for (int i = 0; i < n; i++)
            k += input[i];
 
        // If sum is odd, there cannot be two subsets
        // with equal sum
        if (k % 2 != 0)
            return false;
 
        // Find if there is subset with sum equal to half
        // of total sum
        return subsetSumToKIdentical(input, n, k / 2);

	}
}

     