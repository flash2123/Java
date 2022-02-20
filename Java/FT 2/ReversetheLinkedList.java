public class ReversetheLinkedList{
    public static Node reverse(Node head, int k)
    {
         if(head == null)
          return null;
        Node current = head;
        Node next = null;
        Node prev = null;
 
        int count = 0;
         while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null)
            head.next = reverse(next, k);
        return prev;
        
     }
}