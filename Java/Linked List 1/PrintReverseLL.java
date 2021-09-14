import java.util.Scanner;
public class PrintReverseLL {
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
    public static void printReverse(LinkedListNode<Integer> root) {
        if(root==null) {
			return;
		}
		
		printReverse(root.next);
		System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> root = takeInput();
//		head=eliminateDuplicates(head);
		printReverse(root);
		// Use.print(head);
    }
    
}
