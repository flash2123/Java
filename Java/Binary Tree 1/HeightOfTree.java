public class HeightOfTree{
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }else{
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            if(leftHeight > rightHeight){
                return (leftHeight+1);
            }else{
                return (rightHeight+1);
            }
            
        }
        // return root;
		//Your code goes here
	}
}