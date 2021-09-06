import java.util.Arrays;
import java.util.Scanner;
public class MaxProfitOnApp {

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }


    public static int maximumProfit(int budget[]) {
        Arrays.sort(budget);
		int[] profit=new int[budget.length];
		for(int i=0;i<budget.length;i++) {
			profit[i]=(budget.length-i)*budget[i];
		}
		int max=Integer.MIN_VALUE;
		for(int i : profit) {
			if(max < i) {
				max=i;
			}
		}
		return max;
		
		
	}
        // int n = budget.length;
        // if (n <= 1) {
        //     return 1;
        // }
        //  store the maximum profit gained
    //     int profit = 0;
 
    //     // sell the first stock on the n'th day, and recur for the (n-1)'th day
    //     profit = Integer.max(profit, budget[n] + maximumProfit(budget, n-1));

    //     // sell the second stock on the n'th day, and recur for the (n-2)'th day
    //     // (no transaction can be made on the (n-1)'th day)
    //     // profit = Integer.max(profit, y[n] + findMaxProfit(x, y, n - 2));
 
    //     // return the maximum profit
    //     return profit;
    // }

        // int profit = 0;
        // int j = 0;
        // for (int i = 1; i < budget.length; i++){
        //     if (budget[i - 1] > budget[i]) {
        //         j = i;
        //     }
        //     if (budget[i - 1] <= budget[i] && (i + 1 == budget.length || budget[i] > budget[i + 1])){
        //         profit += (budget[i] - budget[j]);
        //         System.out.printf("Buy on day %d and sell on day %d\n", j + 1, i + 1);
        //         // System.out.printf(j + 1, i + 1);
        //     }
        // }
        // return profit;

    // }
    public static void main(String[] args) {
        int[] budget = takeInput();
        // int n = budget.length-2;
        System.out.println(maximumProfit(budget));
        
    }
}
