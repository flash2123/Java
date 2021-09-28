public class BSTClass{
    private BinaryTreeNode<Integer> root;
    
	public void insert(int data) {
        root = insert(data,root);
    }
    private BinaryTreeNode<Integer> insert(int data, BinaryTreeNode<Integer> root){
        if(root==null){
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
            return newNode;
        }
        if(root.data>=data){
          root.left =   insert(data, root.left);
        } else{
            root.right = insert(data, root.right);
        }
        return root;
		//Implement the insert() function
	}
	
	public void remove(int data) {
        root = remove(data, root);
    }
    private  BinaryTreeNode<Integer> remove(int data , BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
            
        }
        if(data<root.data){
            root.left = remove(data, root.left);
            return root;
        }
        else if(data > root.data){
            root.right = remove(data, root.right);
            return root;
        } else {
            if(root.left == null && root.right == null){
                return null;
            } else if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            } else {
                BinaryTreeNode<Integer> minNode = root.right;
                while (minNode.left != null){
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = remove(minNode.data, root.right);
                return root;
            }
        }
		//Implement the remove() function
	}
	
	public void printTree() {
        printTree(root);
    }
    
     private void printTree (BinaryTreeNode<Integer> root){
        if(root==null){
            return ;
        }
        String toBePrinted = root.data+":";
        if(root.left!=null){
            toBePrinted+="L:"+root.left.data+",";
        }
        if(root.right!=null){
            toBePrinted+="R:"+root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
    
		//Implement the printTree() function
	}
	
	public boolean search(int data) {
        return searchHelper(data, root);
    }
    private boolean searchHelper(int data, BinaryTreeNode<Integer> root){
        if(root== null){
            return false;
        }
        if(root.data == data){
            return true;
        } else if(data>root.data){
            return searchHelper(data,root.right);
        } else {
            return searchHelper(data,root.left);
        }
    }
}