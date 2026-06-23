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
    List<Integer> preOrder(TreeNode root, List<Integer> list)
    {
        if(root.left != null)
        {
            list = preOrder(root.left, list);
        }
        
        if(root.right != null)
        {
            list = preOrder(root.right, list);
        }
        list.add(root.val);
        return list;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        list = preOrder(root, list);
        return list;
    }
}