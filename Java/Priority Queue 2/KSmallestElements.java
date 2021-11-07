import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;

public class KSmallestElements{
    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<k;i++)
        {
            pq.add(input[i]);
        }
        
        for(int i =k;i<n;i++)
        {
        	
        	if(pq.peek()>input[i])
        	{
        		pq.poll();
        		pq.add(input[i]);
        	}
        }
        while(!pq.isEmpty())
        {
        	ans.add(pq.peek());
        	pq.poll();
        }
        return ans;
    }
}