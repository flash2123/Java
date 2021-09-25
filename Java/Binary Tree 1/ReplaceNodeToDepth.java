public class ReplaceNodeToDepth{
    public static void replaceNode(BinaryTreeNode<Integer> root, int level){
        // Base Case
            if (root == null){
                return;
            }
    
            // Replace data with current depth
            root.data = level;
    
            replaceNode(root.left, level+1);
            replaceNode(root.right, level+1);
        }
    
        public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
           replaceNode(root, 0);
        }
}