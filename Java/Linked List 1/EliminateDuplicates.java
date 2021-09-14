import java.util.Scanner;
public class EliminateDuplicates {
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
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head ; 
        
        while(curr!=null && curr.next != null){
            
            if(curr.data.equals(curr.next.data)){
                curr.next = curr.next.next ; 
            }
            else{
                curr = curr.next ; 
            }  
        }
        
        return head ; 
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head=takeInput();
        removeDuplicates(head);
    }
}
