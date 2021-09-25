public class IsNodePresent{
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    if (root == null){
            return false;
        }
 
        if (root.data == x){
            return true;
        }

        // then recur on left subtree /
        boolean res1 = isNodePresent(root.left, x);

        // node found, no need to look further
        if(res1){
            return true;
        }

        // node is not found in left,
        // so recur on right subtree /
        boolean res2 = isNodePresent(root.right, x);

        return res2;
        //Your code goes here
    }
}