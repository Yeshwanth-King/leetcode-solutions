/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean checkPathSum_helper ( TreeNode nodeAddr, int checkSum , int currSum)
   {
	   // preorder 
	   // base case
	   //System.out.printf("D -> check = %d , curr = %d\n", checkSum, currSum);
	   if ( nodeAddr.left == null && nodeAddr.right == null)
	   {
		   return checkSum == currSum+nodeAddr.val;
	   }
	   boolean leftRes = false;
	   boolean righres = false;
	   if ( nodeAddr.left != null )
	       leftRes = checkPathSum_helper ( nodeAddr.left , checkSum, currSum+nodeAddr.val);
	   if ( nodeAddr.right != null )
	       righres = checkPathSum_helper ( nodeAddr.right , checkSum, currSum+nodeAddr.val);
	   return leftRes || righres;
   }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return checkPathSum_helper(root, targetSum, 0);
    }
}