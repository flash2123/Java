public class MergeTwoSortedLL {

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
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        LinkedListNode<Integer> t1 = head1, t2=head2;
        LinkedListNode<Integer> head=null,tail=null;
        if(t1.data <= t2.data){
            head = t1;
            tail = t1;
            t1 = t1.next;
        }else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
		
		while(t1 != null && t2 != null) {
			
			if(t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }else{
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        // one list is over
        if(t1!=null){
            // first list is remaining
            tail.next=t1;
        }else{
            tail.next=t2;
        }		
		return head;
    }
    public static void main(String[] args) {
        
        LinkedListNode<Integer> head1 = takeInput();
        LinkedListNode<Integer> head2 = takeInput();
        mergeTwoSortedLinkedLists(head1, head2);
    }
    
}
