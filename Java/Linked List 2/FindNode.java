import java.util.Scanner;
public class FindNode {

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
	
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
        if(head==null){
            return -1;
        }
        if(head.data==n){
            return 0;
        }
        int smallAns=findNodeRec(head.data, n);
        if(smallAns==-1){
            return -1;
        }
        return 1+smallAns;

    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        int n = head.data;
        findNodeRec(head, n);
    }

    
}
