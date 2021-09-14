public class PalindromeLL {
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
		
		
		LinkedListNode<Integer> prev = null;
        
        
        while(head != null){
            LinkedListNode<Integer> temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if(head == null)
            return true;
        LinkedListNode<Integer> slow=head,fast=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			
			slow=slow.next;
			fast=fast.next.next;
		}
		LinkedListNode<Integer> head1=slow.next;
		LinkedListNode<Integer> head2= head;
		
        head1 = reverse(head1);
		
		while(head1!=null && head2!=null) {
			
			if(!head1.data.equals(head2.data)) {
				return false;
			}
			head1=head1.next;
			head2=head2.next;
		}
		return true;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head=takeInput();
        isPalindrome(head);
    }
    
}
