import java.util.Scanner;
public class BubbleSortLL {

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

    public static int length(LinkedListNode<Integer> head){

		int l=0;
		while(head!=null){
			l++;
			head=head.next;
		}
		return l;
	}


	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        LinkedListNode<Integer>	orginalHead= head;
		int n=length(head);
		for(int i=0;i<n-1;i++){
			LinkedListNode<Integer> prev=null,curr=orginalHead;
			for(int j=0;j<n-i-1;j++){                           // while(curr.next!=null)

				if(curr.data <=curr.next.data){

					prev=curr;
					curr=curr.next;

				}else{
					if(prev==null){
						LinkedListNode<Integer> curr2= curr.next; 
						LinkedListNode<Integer>  temp= curr2.next;
						curr2.next= curr;
						curr.next=temp;
						prev=curr2;
						orginalHead= curr2;
					}else{
						LinkedListNode<Integer> curr2= curr.next;
						LinkedListNode<Integer>  temp= curr2.next;
						prev.next=curr2;
						curr2.next=curr;
						curr.next=temp;
						prev= curr2;
					}


				}

			}

		}
		return orginalHead;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        bubbleSort(head);
    }

    
}
