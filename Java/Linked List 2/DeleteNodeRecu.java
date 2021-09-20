import java.util.Scanner;
public class DeleteNodeRecu {
    public static LinkedListNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        
        int data = s.nextInt();
        LinkedListNode<Integer> head = null, tail = null;
        while(data != -1){
            LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(data);
            if(head==null){
                // Make this node as head node
                head = currentNode;
                tail = currentNode;
            }else{
                // LinkedListNode<Integer> tail = head;
                // while(tail.next != null){
                //     tail=tail.next;
                // }
                // Now tail will refer to last node
                //  connect current node after last node
                tail.next = currentNode;
                tail = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head,int pos,int data){
		
	
		if(pos==0) {
			
			LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(data);
			newNode.next=head;
			return newNode;
			
		}
		if(head==null) {
			return head;
		}
		
		head.next= insert(head.next, pos-1, data);
		return head;
	}


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	if(head==null) {
			return head;
		}
		
		if(pos==0) {
			return head.next;
		}
		head.next=deleteNodeRec(head.next, pos-1);
		
		return head;
	
        //Your code goes here
	}
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        int pos = head.data;
        deleteNodeRec(head, pos);
    }
    
}
