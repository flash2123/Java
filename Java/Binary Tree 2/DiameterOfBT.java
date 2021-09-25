public class DiameterOfBT{
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null) {
			return 0;
		}
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int leftDiameter=diameterOfBinaryTree(root.left);
        int rightDiameter=diameterOfBinaryTree(root.right);
        return Math.max(leftHeight+rightHeight+1,Math.max(leftDiameter,rightDiameter) );
		
		
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return 1+Math.max(height(root.left), height(root.right));
	}
}