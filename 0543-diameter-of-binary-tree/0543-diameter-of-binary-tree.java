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
    int max = 0;
    int findMax(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        int lh = findMax(node.left);
        int rh = findMax(node.right);
        max = Math.max(max, lh+rh);
        return Math.max(lh, rh) + 1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        findMax(root);
        return max;
    }
}