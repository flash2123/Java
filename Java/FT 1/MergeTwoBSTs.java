public class MergeTwoBSTs{
    public static void inorder(BinaryTreeNode<Integer> root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
	static void printMergeTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        Stack<BinaryTreeNode<Integer>> s1 = new Stack<BinaryTreeNode<Integer>>();
     
        // Current node of first BST
        BinaryTreeNode<Integer> current1 = root1;
     
        // s2 is stack to hold nodes of second BST
        Stack<BinaryTreeNode<Integer>> s2 = new Stack<BinaryTreeNode<Integer>>();
     
        // Current node of second BST
        BinaryTreeNode<Integer> current2 = root2;
     
        // If first BST is empty, then output is inorder
        // traversal of second BST
        if (root1 == null)
        {
            inorder(root2);
            return;
        }
         
        // If second BST is empty, then output is inorder
        // traversal of first BST
        if (root2 == null)
        {
            inorder(root1);
            return ;
        }
     
        // Run the loop while there are nodes not yet printed.
        // The nodes may be in stack(explored, but not printed)
        // or may be not yet explored
        while (current1 != null || !s1.isEmpty() ||
            current2 != null || !s2.isEmpty())
        {
             
            // Following steps follow iterative Inorder Traversal
            if (current1 != null || current2 != null )
            {
                // Reach the leftmost node of both BSTs and push ancestors of
                // leftmost nodes to stack s1 and s2 respectively
                if (current1 != null)
                {
                     
                    s1.push( current1);
                    current1 = current1.left;
                }
                if (current2 != null)
                {
                    s2.push( current2);
                    current2 = current2.left;
                }
     
            }
            else
            {
                 
                // If we reach a NULL node and either of the stacks is empty,
                // then one tree is exhausted, ptint the other tree
                if (s1.isEmpty())
                {
                    while (!s2.isEmpty())
                    {
                        current2 = s2.pop ();
                        current2.left = null;
                        inorder(current2);
                    }
                    return ;
                }
                if (s2.isEmpty())
                {
                    while (!s1.isEmpty())
                    {
                        current1 = s1.pop ();
                        current1.left = null;
                        inorder(current1);
                    }
                    return ;
                }
     
                // Pop an element from both stacks and compare the
                // popped elements
                current1 = s1.pop();
                 
                current2 = s2.pop();
                 
                // If element of first tree is smaller, then print it
                // and push the right subtree. If the element is larger,
                // then we push it back to the corresponding stack.
                if (current1.data < current2.data)
                {
                    System.out.print(current1.data + " ");
                    current1 = current1.right;
                    s2.push( current2);
                    current2 = null;
                }
                else
                {
                    System.out.print(current2.data + " ");
                    current2 = current2.right;
                    s1.push( current1);
                    current1 = null;
                }
            }
        }
        System.out.println(s1);
        System.out.println(s2);
		/*
		 * Your class should be named Solution.Don't write main().Don't take
		 * input, it is passed as function argument.Print output as specified in
		 * question.
		 */
	}
}