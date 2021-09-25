public class CreateAndInsertDuplicateNode{
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if (root == null){
            return;
        }
        BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<Integer>(root.data);
        duplicateNode.left = root.left;
        root.left = duplicateNode;
        insertDuplicateNode(duplicateNode.left);
        insertDuplicateNode(root.right);
        return;
    
		//Your code goes here
	}
}