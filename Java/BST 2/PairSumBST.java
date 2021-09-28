import java.util.ArrayList;
import java.util.Collections;
public class PairSumBST{
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        if(root==null) {
			return ;
		}
		ArrayList<Integer> arr = convertTreeToArray(root);
		Collections.sort(arr);
		int i=0,j=arr.size()-1;
		while(i<j) {
			
			if(arr.get(i)+ arr.get(j)==s) {
				System.out.println(arr.get(i) +" " + arr.get(j));
				i++;
				j--;
			}
			else if(arr.get(i) + arr.get(j) < s ) {
				i++;
			}
			else {
				j--;
			}
			
		}
		
	}

	private static ArrayList<Integer> convertTreeToArray(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return new ArrayList<>();
		}
		
		ArrayList<Integer> leftArrayList = convertTreeToArray(root.left);
		ArrayList<Integer> rightArrayList = convertTreeToArray(root.right);
		ArrayList<Integer> ansArrayList = new ArrayList<>();
		for(int i : leftArrayList) {
			ansArrayList.add(i);
		}
		for(int i : rightArrayList) {
			ansArrayList.add(i);
		}
		ansArrayList.add(root.data);
		return ansArrayList;
	
}