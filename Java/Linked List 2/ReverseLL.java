import java.util.Scanner;
public class ReverseLL {

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
    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if(head == null){
            return head;
        }
        LinkedListNode<Integer> prev = null;
    	LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
		
    }

    // ------------------- OR---------------------------------
    // -------------This is also the code-------------------


    //     if(head==null || head.next==null){
    //         return head;
    //     }
    //     LinkedListNode<Integer> smallHead = reverseLinkedListRec(head.next);
    //     LinkedListNode<Integer> tail = smallHead;
    //     while(tail.next!=null){
    //         tail=tail.next;
    //     }
    //     tail.next = head;
    //     head.next = null;
    //     return smallHead;
    // }
    
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        reverseLinkedListRec(head);

    }
    
}
