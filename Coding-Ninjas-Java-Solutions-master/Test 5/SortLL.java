public class SortLL {
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow=head,fast=head;
		while (fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
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

    

	public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
        if(head == null || head.next==null) {
			return head;
		}
		LinkedListNode<Integer> middle= midPoint(head);
		LinkedListNode<Integer> head1=head,head2=middle.next;
		middle.next=null;
		
		head1=sort(head1);
		head2=sort(head2);
		head=mergeTwoSortedLinkedLists(head1, head2);
		return head; 
        
       
		//Your code goes here
	}

    
}
