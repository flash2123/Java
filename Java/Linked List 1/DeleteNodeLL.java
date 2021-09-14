import java.util.Scanner;
public class DeleteNodeLL {
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
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        if(head==null) {
			return head;
		}
		// if(index>=LengthOfLL.lengthOfLinkedList(head)) {
		// 	return head;
		// }
		if(pos==0) {
			return head.next;
		}
		int i=1;
		LinkedListNode<Integer> curr=head,prev=null;
		while(i<=pos && curr!=null) {
			prev=curr;
			curr=curr.next;
			i++;
		}
        if(curr==null){
            prev.next=null;
        }else{
            prev.next=curr.next;
        }
		
		return head;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        deleteNode(head, 0);
    }

    
}
