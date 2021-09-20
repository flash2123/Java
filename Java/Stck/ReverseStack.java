import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        if(input.isEmpty()) {
			return ;
		}
		int temp = input.pop();
		reverseStack(input, extra);
		while(!input.isEmpty() ) {
			extra.push(input.pop());
		}
		input.push(temp);
		while(!extra.isEmpty()) {
			input.push(extra.pop());
		
    }
    public static void main(String[] args) {
        
    }
    
}
