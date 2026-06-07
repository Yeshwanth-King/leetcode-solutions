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
    List<List<Integer>> result;
    void pathSum_helper(TreeNode procNode, int targetSum, int currSum,List<Integer> path  )
   {
	   if(procNode.left == null && procNode.right == null)
	   {
		   if(targetSum == currSum + procNode.val)
		   {
			   path.add(procNode.val);
               System.out.println(path);
               List<Integer> copy = new ArrayList<>(path);
               result.add(copy);
               System.out.println(result);
               path.remove(path.size() - 1);
            //    result.add(path);
               return;
		   }
		   return;
	   }
	   path.add(procNode.val);
	   if(procNode.left != null)
	   {
		   pathSum_helper(procNode.left, targetSum, currSum + procNode.val, path);
	   }
	   if(procNode.right != null)
	   {
		   pathSum_helper(procNode.right, targetSum, currSum + procNode.val, path);
	   }
	   path.remove(path.size() - 1);
   }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        result = new ArrayList<>();
	   List<Integer> path = new ArrayList<>();
	   if(root == null)
			return result;
		
		pathSum_helper( root, targetSum, 0, path );
		
		return result;
    }
}