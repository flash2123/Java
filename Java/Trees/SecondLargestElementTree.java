public class SecondLargestElementTree{
    public static void change(TreeNode<Integer> root,int m) {

		if(root==null) {
			return ;
		}
		if(root.data == m) {
			root.data = Integer.MIN_VALUE;
		}
		for(int i=0;i<root.children.size();i++) {
			change(root.children.get(i), m);
		}

	}

	public static TreeNode<Integer> largest(TreeNode<Integer> root ) {
		if(root==null) {
			return root;
		}
		int max =root.data;
		TreeNode<Integer> maxNode = root;
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> large = largest(root.children.get(i));
			if(large == null){
				continue;
			}
			if(max <large.data) {
				max = large.data;
				maxNode = large;
			}
		}
		return maxNode;
	}
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		int largest = largest(root).data;

		change(root, largest);

		return largest(root);
    }
}