import java.util.Scanner;
public class DeleteEveryNode {

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


    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		if(M==0) {
	            return null;
	        }
		if (N==0)
		{
			return head;
		}
	        LinkedListNode<Integer> orginal=head;
	        LinkedListNode<Integer> temp1=head,temp2=head;
	        while(head!=null) {
	            temp1=head;
	            for(int i=1;i<M && temp1!=null;i++) {
	                temp1=temp1.next;
	            }
	            if(temp1!=null) {
	                temp2=temp1.next;
	            }
	            for(int i=1;i<N && temp2!=null;i++) {
	                temp2=temp2.next;
	            }
	            if(temp2!=null) {
	                temp2=temp2.next;
	            }
	            if(temp1!=null)
	                temp1.next=temp2;
	            head=temp2;



	        }
	        return orginal;
        //Your code goes here
	}
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        int M = head.data;
        int N = head.data;
        skipMdeleteN(head, M, N);
    }
    
}
