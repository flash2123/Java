import java.util.Scanner;
public class KReverse {

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

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){

		LinkedListNode<Integer> pre=null,curr=head;
		while(curr!=null){

			LinkedListNode<Integer> temp= curr.next;
			curr.next=pre;
			pre=curr;
			curr=temp;
		}
		return pre;


	}

    public static int len(LinkedListNode<Integer> head){
		int l=0;
		while(head!=null){
			l++;
			head=head.next;
		}
		return l;
	}
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if(k >= len(head)){
			return reverse(head);
		}
		LinkedListNode<Integer> tempHead= head;
		for(int i=1;i<k;i++){
			head=head.next;
		}
		LinkedListNode<Integer> temp=head.next;
		head.next=null;
		LinkedListNode<Integer> reversedHead= reverse(tempHead);
		LinkedListNode<Integer> tail= tempHead;
		LinkedListNode<Integer> smallAns= kReverse(temp,k);
		tail.next= smallAns;
		return reversedHead;

    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        int k = head.data;
        kReverse(head, k);
        
    }
    
}
