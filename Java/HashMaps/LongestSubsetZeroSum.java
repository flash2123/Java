import java.util.HashMap;
public class LongestSubsetZeroSum{
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        int maxCount = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int index = 0;
		for(int i : arr) {
			sum += i;
			if(sum==0) {
				int count = index+1;
				if(count > maxCount) {
					maxCount = count;
				}
			}
			if(map.containsKey(sum)) {
				int count = index - map.get(sum) ;
				if(count > maxCount) {
					maxCount = count;
				}
			}
			else {
				map.put(sum, index);
			}
			index++;
		}


		return maxCount;
		// Write your code here
	}
}