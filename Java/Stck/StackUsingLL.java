public class StackUsingLL {
    private int length;
    Node top;

    //Define the data members


    public Stack() {
        length = 0;
        top = null;
        //Implement the Constructor
    }
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
        }
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        return length;
        //Implement the getSize() function
    }

    public boolean isEmpty() {
        return (length == 0);
        //Implement the isEmpty() function
    }

    public void push(int element) {
        Node new_node = new Node(element);
        
        if(isEmpty()){
            top = new_node;
        }else{
            new_node.next = top;
            top = new_node;
        }
        length++;
        //Implement the push(element) function
    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int val = top.data;
        top = top.next;
        length--;
        return val;
        //Implement the pop() function
    }

    public int top() {
         if(isEmpty()){
            return -1;
        }
        return top.data;
        //Implement the top() function
    }
    
}
