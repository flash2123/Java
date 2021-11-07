public class FindHeight{
    public static int getHeight(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int maxHeight = 0;
        for(int i=0;i<root.children.size();i++) {
			int max = getHeight(root.children.get(i));
			if(maxHeight< max ) {
				maxHeight = max;
			}
		}
		return maxHeight + 1;
    }
}