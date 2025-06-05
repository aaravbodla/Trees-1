// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : none
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
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
    TreeNode prev;
    boolean flag;
    public boolean isValidBST(TreeNode root) {
        this.flag = true;
        helper(root);
        return flag;
    }

    public void helper(TreeNode root){
        if(root == null) return;

        helper(root.left);
        if(prev != null && prev.val >= root.val){
            flag = false;
        }
        prev = root;
        helper(root.right);
    }
}
