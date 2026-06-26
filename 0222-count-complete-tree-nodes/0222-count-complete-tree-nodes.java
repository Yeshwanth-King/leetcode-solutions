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
    int DFS(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int lf = DFS(root.left);
        int rf = DFS(root.right);
        return lf + rf + 1;
    }
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return DFS(root);
    }
}