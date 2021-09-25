public class NodesGreaterThanX{
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if(root == null){
            return 0;
        }
       
        int countLeft = countNodesGreaterThanX(root.left, x);
    	int countRight = countNodesGreaterThanX(root.right, x);

    	return (root.data > x ? 1 : 0) + countLeft + countRight;
		//Your code goes here
	}
}