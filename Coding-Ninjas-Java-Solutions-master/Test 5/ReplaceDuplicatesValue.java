import java.util.HashMap;
public class ReplaceDuplicatesValue {
    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int item){
        LinkedListNode<Integer> temp = new LinkedListNode<Integer>(0);
        temp.data = item;
        temp.next = head;
        head = temp;
        return head;
    }

	public static void changeLL(LinkedListNode<Integer> head) {
        HashMap<Integer, Integer> map = new HashMap<>();
 
    	LinkedListNode<Integer> temp = head;
        int maxNum = 0;
        while(temp!=null){
            map.put(temp.data,(map.get(temp.data) == null?0:map.get(temp.data))+1);
        	if (maxNum < temp.data){
                maxNum = temp.data;
            }
            temp = temp.next;
        }
        while(head!=null){
            if (map.get(head.data) > 1){
                map.put(head.data, -1);
            }else if(map.get(head.data) == -1){
                head.data = ++maxNum;
            }
            head = head.next;
        }
		

	}
    
}
