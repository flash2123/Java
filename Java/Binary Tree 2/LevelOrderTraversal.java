import java.util.LinkedList;
import java.util.Queue;
public class LevelOrderTraversal{
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> frontNode = queue.poll();
			if(frontNode==null) {
				System.out.println();
				if(!queue.isEmpty()) {
					queue.add(null);
				}
			}
			else {
				System.out.print(frontNode.data+" ");
				if(frontNode.left!=null) {
					queue.add(frontNode.left);
				}
				if(frontNode.right!=null) {
					queue.add(frontNode.right);
				}
			}

		}

		//Your code goes here
	}

}