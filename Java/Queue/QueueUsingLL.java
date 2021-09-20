import java.util.LinkedList;
public class QueueUsingLL {
    private int length;
    Node front;
    Node rear;
	
	//Define the data members


	public Queue() {
        front = null;
        rear = null;
        length = 0;
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
        return length == 0;
    	//Implement the isEmpty() function
    }


    public void enqueue(int data) {
        Node new_node = new Node(data);
        
        if(front==null){
            front = new_node;
            rear= new_node;
        }else{
            rear.next=new_node;
            rear= new_node;
        }
        length++;
    }


    public int dequeue(){
        if(isEmpty()){
            // return Integer.MIN_VALUE;
            return -1;
        }
        int val = front.data;
        front = front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return val;
        
        
    }


    public int front(){
        if(isEmpty()){
            // return Integer.MIN_VALUE;
            return -1;
        }
        return front.data;
    }
    
}
