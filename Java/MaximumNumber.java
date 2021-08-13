import java.util.Scanner;
public class MaximumNumber {
    public static int max_number(int n){
    //     int count[] = new int[10];
         
    //     // Converting given number to string
    //     String str = Integer.toString(n);
         
    //     // Updating the count array
    //     for(int i=0; i < str.length(); i++)
    //         count[str.charAt(i)-'0']++;
         
    //     // result is to store the final number
    //     int result = 0, multiplier = 1;
         
    //     // Traversing the count array
    //     // to calculate the maximum number
    //     for (int i = 0; i <= 9; i++)
    //     {
    //         while (count[i] > 0)
    //         {
    //             result = result + (i * multiplier);
    //             count[i]--;
    //             multiplier = multiplier * 10;
    //         }
    //     }
      
    //     // return the result
    //     return result;
    // }

    for (int j = 0; j < 1; j++) {
 
        int ans = 0;
        int i = 1;

        // Remove the least digit
        // after every iteration
        while (n / i > 0) {

            // Store the numbers formed after
            // removing every digit once
            int temp = (n / (i * 10))
                           * i
                       + (n % i);
            i *= 10;

            // Compare and store the maximum
            ans = Math.max(ans, temp);
        }
        n = ans;
    }

    // Return the remaining number
    // after K removals
    return n;
}

    

    public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        // k=s.nextInt();
        System.out.println(max_number(n));
        
    }
    
}
