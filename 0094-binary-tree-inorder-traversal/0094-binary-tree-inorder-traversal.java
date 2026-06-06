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
    private void inorder_helper(TreeNode proc, ArrayList<Integer> result)
    {
        if(proc.left == null && proc.right == null)
        {
            result.add(proc.val);
            return;
        }
        if(proc.left != null)
        {
            inorder_helper(proc.left, result);
        }
        result.add(proc.val);
        if(proc.right != null)
        {
            inorder_helper(proc.right,result);
        }


    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        inorder_helper(root, result);

        return result;
    }
}