import java.util.Scanner;
public class InsertNode {

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

    public static void print(LinkedListNode<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}


    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
        LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(data);
        if(pos==0){
            newNode.next=head;
            return newNode;
        }else{
            int count = 0;
            LinkedListNode<Integer> prev = head;
            while(count < pos-1 && prev != null){
                count++;
                prev = prev.next;
            }
            if(prev != null){
                newNode.next=prev.next;
                prev.next =newNode;
            }
            return head;
        }    
    }
		
		// if(pos>LengthOfLL.lengthOfLinkedList(head)) {
		// 	return head;
		// }
	// 	if(pos==0) {
	// 		newNode.next=head;
	// 		return newNode;
	// 	}
	// 	LinkedListNode<Integer> prev=null,curr=head;
	// 	int i=1;
	// 	while(i<=pos) {
	// 		prev=curr;
	// 		curr=curr.next;
	// 		i++;
	// 	}
	// 	prev.next=newNode;
	// 	newNode.next=curr;
	// 	return head;
	// }
    public static void main(String[] args) {
        LinkedListNode<Integer> head=takeInput();
        LinkedListNode<Integer> pos=takeInput();
        LinkedListNode<Integer> data=takeInput();
        head = insert(head, pos, data);
		print(head);
        // System.out.println(insert(head, pos, data));
        
    }
    
}
