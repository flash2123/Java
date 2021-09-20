import java.util.Scanner;
public class EvenAfterOdd {

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

    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> headOdd = null, tailOdd = null, headEven = null, tailEven = null;
        while(head != null){
            if(head.data % 2 == 0){
                if(headEven == null){
                    headEven = head;
                    tailEven = head;
                }else{
                    tailEven.next = head;
                    tailEven = head;
                }
            }else{
                if(headOdd == null){
                    headOdd = head;
                    tailOdd = head;
                }else{
                    tailOdd.next = head;
                    tailOdd = head;
                }
            }
            head = head.next;
        }
        if(headOdd == null){
            return headEven;
        }
        if(headEven == null){
            return headOdd;
        }
        tailOdd.next = headEven;
        tailEven.next = null;
        return headOdd;

    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        evenAfterOdd(head);
    }
    
}
