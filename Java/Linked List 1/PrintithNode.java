import java.util.Scanner;

public class PrintithNode {


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
    public static void printIthNode(LinkedListNode<Integer> head, int posn){
        if(head==null) {
			return ;
		}
		int j=0;
		while(head!= null) {
			if(j==posn){
                System.out.println(head.data);
                break;
            }
            head=head.next;
            j++;
        }

    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        printIthNode(head, 3);

        
        // System.out.println(printIthNode(head, posn));
    }
    
    
}
