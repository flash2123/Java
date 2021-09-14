
import java.util.LinkedList;
import java.util.Scanner;

public class LengthofLL {

    public static LinkedListNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        while(data != -1){
            LinkedListNode<Integer> currentNode = new Node<Integer>(data);
            if(head==null){
                // Make this node as head node
                head= currentNode;
            }else{
                LinkedListNode<Integer> tail = head;
                while(tail.next != null){
                    tail=tail.next;
                }
                // Now tail will refer to last node
                //  connect current node after last node
                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    
    public static int length(LinkedListNode<Integer> head){
        int l=0;
        LinkedListNode<Integer> temp = head;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        return l;
    }
    
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        
        System.out.println(length(head));
    }
    
    
}
