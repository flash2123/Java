import java.util.Scanner;
public class SwapTwoNodes {

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

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		LinkedListNode<Integer> prev1=null,curr1=head,curr2=head,prev2=null;

		for(int k=1;k<=i;k++){
			prev1=curr1;
			curr1=curr1.next;
		}
		for(int l=1;l<=j;l++){
			prev2=curr2;
			curr2=curr2.next;
		}
		if(prev1==null){
			head=curr2;
		}
		else{
			prev1.next=curr2;
		}

		LinkedListNode<Integer> temp=curr2.next;
		if(prev2!=curr1)
			curr2.next=curr1.next;
		else
			curr2.next=curr1;
		if(prev2==null){
			head=curr1;
		}
		else{
			prev2.next=curr1;
		}
		curr1.next=temp;
		return head;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        int i = head.data;
        int j = head.data;
        swapNodes(head, i, j);
    }
    
}
