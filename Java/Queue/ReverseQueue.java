import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> input) {
        if(input.isEmpty()) {
			return ;
		}
		int temp = input.poll();
		reverseQueue(input);
		input.add(temp);
    }
    public static Queue<Integer> reverseKelements(Queue<Integer> input , int k) {
		
		Stack<Integer> stack = new Stack<>();
		for(int i=1;i<=k;i++) {
			stack.push(input.poll());
		}
		for(int i=1;i<=k;i++) {
			input.add( stack.pop()  );
		}
		for(int i=1;i<= input.size() - k ;i++){
            input.add(input.poll());
        }
		return input;
		//Your code goes here
	}


    
}
