import java.util.ArrayList;
import java.util.PriorityQueue;
public class KthLargestElement{
    public static int kthLargest(int n, int[] input, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for(int i=0;i<k;i++)
			priorityQueue.add(input[i]);
		for(int i= k ;i < input.length;i++) {
			if(input[i] > priorityQueue.peek() ) {
				priorityQueue.remove();
				priorityQueue.add(input[i]);
			}
		}
		return priorityQueue.remove();
    }
}