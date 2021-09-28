public class ContructBST{
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int n,int ei){
		if(n>ei) {
			return null;
		}
		int mid = (n+ei)/2;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
		root.left = SortedArrayToBST(arr,n,mid-1);
		root.right = SortedArrayToBST(arr, mid+1, ei);
		return root;
		
		
		
	}
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return SortedArrayToBST(arr,0,arr.length-1);
			
	}
}