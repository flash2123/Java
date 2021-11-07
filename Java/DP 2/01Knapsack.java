public class 01Knapsack{
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
        int[][] storage = new int[n+1][maxWeight+1];

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=maxWeight;j++) {
				if(weights[i-1] > j) {
					storage[i][j] = storage[i-1][j];
				}
				else {
					storage[i][j] = Math.max( storage[i-1][j], storage[i-1][ j - weights[i-1] ] + values[i-1] );
				}
			}
		}
		return storage[n][maxWeight];

	}
	
	
	public static int knapsackBetter(int[] weight, int value[],int maxWeight){
		int n = weight.length;
		
		int[] storagePrev = new int[maxWeight+1];
		int[] storageCurr = new int[maxWeight+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=maxWeight;j++) {
				if(weight[i-1] > j) {
					storageCurr[j] = storagePrev[j];
				}
				else {
					storageCurr[j] = Math.max( storagePrev[j] , storagePrev[j-weight[i-1]] + value[i-1] );
				}
			}
			storagePrev = storageCurr;
			storageCurr = new int[maxWeight+1];
		}
		return storagePrev[maxWeight];
    }
}