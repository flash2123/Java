import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElement {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        if(input.isEmpty()==true || k>input.size()){
            return input;
        }
        if(k<=0){
            return input;
        }
        Stack<Integer> stack = new Stack<Integer>();
        
         // Push the first K elements into a Stack
        for(int i = 0; i<k; i++){
            stack.push(input.peek());
            input.remove();
        }
        // Enqueue the contents of stack
        // at the back of the queue
        while(!stack.empty()){
            input.add(stack.peek());
            stack.pop();
        }
        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < input.size() - k; i++) {
            input.add(input.peek());
            input.remove();
        }
        return input;
        
		
	}

    
}
