
public class Solution {
    
    static int countWaysUtil(int x, int n, int num)
    {
        // Base cases
        int val = (int) (x - Math.pow(num, n));
        if (val == 0)
            return 1;
        if (val < 0)
            return 0;
      
        // Consider two possibilities, num is
        // included and num is not included.
        return countWaysUtil(val, n, num + 1) +
               countWaysUtil(x, n, num + 1);
    }

    
    public static int allWays(int x, int n) {
        return countWaysUtil(x, n, 1);
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */

    }
}




// FLags question
// long long find_Ways(int N)
// {
//     if(N==1 || N==2) return 2;
    
//     long long ans=find_Ways(N-1)+find_Ways(N-2);
    
//     return ans;
    

// }


// Sum of Powers of Three
// static public boolean checkPowersOfThree(int n) {
//     while(n!=0){
//         if(n%3==2)
//             return false;
//         n=n/3;
//     }
//     return true;
    
//     // Write your code here
    
// }



// Break Number
// public class solution {
    
//     public static void printPartitions(int num, int maxValue, String suffix) {
//     if (num == 0)
//         System.out.println(suffix);
//     else {
//         if (maxValue > 1)
//             printPartitions(num, maxValue-1, suffix);
//         if (maxValue <= num)
//             printPartitions(num-maxValue, maxValue, maxValue + " " + suffix);
//     	}
//     }
        
// 	public static void printCombination(int num){
//         printPartitions(num, num, "");
// 		//Write your code here
// 	}
// }

