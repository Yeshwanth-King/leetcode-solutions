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
    int preOrder(TreeNode node)
    {
        if(node == null) return 0;

        int left = preOrder(node.left);
        int right = preOrder(node.right);
        return Math.max(left,right) + 1;

    }
    public int maxDepth(TreeNode root) {
        return preOrder(root);
    }
}