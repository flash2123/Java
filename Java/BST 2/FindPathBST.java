import java.util.ArrayList;
public class FindPathBST{
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if (root == null) {
			return null;
		}
		if (root.data == data) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		if (root.data > data) {
			ArrayList<Integer> leftOutput = getPath(root.left, data);
			if (leftOutput != null) {
				leftOutput.add(root.data);
				return leftOutput;
			} else {
				return null;
			}
		} else {
			ArrayList<Integer> rightOutput = getPath(root.right, data);
			if (rightOutput != null) {
				rightOutput.add(root.data);
				return rightOutput;
			} else {
				return null;
            }
        }
    }
}