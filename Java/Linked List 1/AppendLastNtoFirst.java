import java.util.Scanner;

import jdk.internal.net.http.frame.HeaderFrame;
public class AppendLastNtoFirst {
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

    public static void print(LinkedListNode<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}

    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        int length = 0;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> prev = head;
        LinkedListNode<Integer> h= null;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(length==0||length==1){
            return head;
        }
        if(n==0){
            return head;
        }
        int count = length - n;
        int i = 0;
        while(prev!=null){
            i++;
            if(i==count && prev != null){
                h= prev.next;
                prev.next=null;
                break;
            }
            prev=prev.next;
        }
        LinkedListNode<Integer> a = h;
        while(a.next != null){
            a=a.next;
        }
        a.next = head;
        return h;

    }
        
    public static void main(String[] args) {
        LinkedListNode<Integer> head=takeInput();
        int n = head.data;
		head=appendLastNToFirst(head, n);
		print(head);
    }
    
}
