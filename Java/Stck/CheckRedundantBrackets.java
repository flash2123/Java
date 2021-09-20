import java.util.Scanner;
import java.util.Stack;
public class CheckRedundantBrackets {
    public static boolean checkRedundantBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
		for(int i=0;i<expression.length();i++) {

			if(expression.charAt(i)==')') {
				int count =0;
				while(stack.peek()!='(' ) {
					count++;
					stack.pop();
				}
				stack.pop();
				if(count==0||count==1)
					return true;

			}
			else {
				stack.push(expression.charAt(i));
			}

		}
		return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = s.nextLine();
        checkRedundantBrackets(expression);
    }
    
}
