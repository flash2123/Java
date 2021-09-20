import java.util.Stack;
public class StactTest {
    public static void main (String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        // stack.push(5);
        // stack.push(10);
        // stack.push(15);
        // System.out.print(stack.pop()+stack.size());

        for(int i=0;i<10;i++)
        {
            stack.push(i*2);
        }
        System.out.print(stack.peek());
    }
    
}
