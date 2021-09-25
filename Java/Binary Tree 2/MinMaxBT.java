public class MinMaxBT{
    public static int getMax(BinaryTreeNode<Integer> root){
        if (root == null){
             return Integer.MIN_VALUE;
        }
  
         int res = root.data;
         int lres = getMax(root.left);
         int rres = getMax(root.right);
  
         if (lres > res){
             res = lres;
         }
         if (rres > res){
             res = rres;
         }
         return res;  
    }
     
    public static int getMin(BinaryTreeNode<Integer> root){
        if (root == null){
            return Integer.MAX_VALUE;
        }
  
         int res = root.data;
         int lres = getMin(root.left);
         int rres = getMin(root.right);
 
         if (lres < res){
             res = lres;
         }
         if (rres < res){
             res = rres;
         }
         return res;
        
        
    } 
     public static  Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
         if(root==null){   
             Pair<Integer, Integer> output1 = new Pair<>(Integer.MIN_VALUE, Integer.MAX_VALUE);
              return output1;
         }
         int  max = getMax(root);
         int  min = getMin(root);
                 Pair<Integer,Integer> output = new Pair<>(min, max);
         return output;
         //Your code goes here
     }
}