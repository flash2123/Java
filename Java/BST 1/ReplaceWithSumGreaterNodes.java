public class ReplaceWithSumGreaterNodes{
    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        replaceWithGreatestSum(root);
    }

    
    static int sum = 0;
	public static void replaceWithGreatestSum(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return;
		replaceWithGreatestSum(root.right);
		root.data = root.data + sum;
		sum = root.data;
		replaceWithGreatestSum(root.left);
	}
}