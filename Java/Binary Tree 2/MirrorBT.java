public class MirrorBT{
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if (root == null){
        	return;
        }
 
       if(root.left!=null){
           mirrorBinaryTree(root.left);
       }
        if(root.right!=null){
           mirrorBinaryTree(root.right);
       }
       BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
		//Your code goes here
	}
	
}