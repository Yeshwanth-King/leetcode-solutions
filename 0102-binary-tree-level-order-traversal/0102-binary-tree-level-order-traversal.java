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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        qu.offer(root);
        int level = 0;
        while(qu.isEmpty() == false)
        {
            int size = qu.size();
            List<Integer> ans = new ArrayList<>();
            for(int iter = 0; iter < size; iter++)
            {
            
                TreeNode curr = qu.poll();
                if(curr.left != null)
                {
                    qu.offer(curr.left);
                }
                if(curr.right != null)
                {
                    qu.offer(curr.right);
                }
                ans.add(curr.val);
            }
            if(ans.size() >0)
            {
                res.add(ans);
            }
        }
        return res;
    }
}