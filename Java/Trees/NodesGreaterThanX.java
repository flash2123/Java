public class NodesGreaterThanX{
    public static int count = 0;
	public static int numNodeGreater(TreeNode<Integer> root,int x){
		if (root == null) {
			return 0;
		} else if (root.data  > x) {
			count++;
		}
		for (int i = 0; i < root.children.size(); i++) {
			numNodeGreater(root.children.get(i), x);
		}
		return count;
		// Write your code here		

	}
}