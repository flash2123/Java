public class SmallestSuperSequence{
    public static int smallestSuperSequence(String str1, String str2) {
        int n =str1.length();
		int m = str2.length();
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i = 1;i<dp.length;i++)
		{
			for(int j = 1;j<dp[0].length;j++)
			{
				if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					dp[i][j]=1+ dp[i-1][j-1];
				}
				else
				{
					int a = dp[i-1][j];
					int b = dp[i][j-1];
					dp[i][j]=Math.max(a, b);
				}
			}
		}
		
		int tcount = m+n - dp[n][m];
		return tcount;
    }
}