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
    int tempRes;
    boolean verify_v1 ( boolean [ ] check )
   {
	   int checkInd;
	   int trueCtr = 0;
	   for ( checkInd = 0; checkInd < 10; checkInd++)
	   {
		   if ( check [ checkInd] == true )
			   trueCtr++;
	   }
	   if ( trueCtr > 1 )
		   return false;
	   return true;
   }
   void ppp_helper_v1 ( TreeNode proc, boolean [] dig_occ )
   {
	   if ( proc.left == null && proc.right == null )
	   {
		   if ( dig_occ [ proc.val] == true )
			   dig_occ [ proc.val ] = false;
		   else
			   dig_occ [ proc.val ] = true;
		   if ( verify_v1( dig_occ ) == true )
		   {
			   
			   tempRes++;
			   //print( dig_occ );
		   }
		   if ( dig_occ [ proc.val] == false )
			   dig_occ [ proc.val ] = true;
		   else
			   dig_occ [ proc.val ] = false;
		   return;
	   }
		   if ( dig_occ [ proc.val] == true )
			   dig_occ [ proc.val ] = false;
		   else
			   dig_occ [ proc.val ] = true;
            if ( proc.left != null )
               ppp_helper_v1( proc.left, dig_occ );
            if ( proc.right != null )
               ppp_helper_v1( proc.right, dig_occ );
		    if ( dig_occ [ proc.val] == false )
			   dig_occ [ proc.val ] = true;
		   else
			   dig_occ [ proc.val ] = false;
		   
   }
    public int pseudoPalindromicPaths (TreeNode root) {
        boolean [] digit_occurs = new boolean [ 10 ];
		// call helper - recursive , pass, initiate
        tempRes = 0;
        ppp_helper_v1( root, digit_occurs ); // pseudo palindrome path finder
        int giveBack = tempRes;
        tempRes = 0;
        return giveBack;
    }
}