// Time Complexity : O(N*h)
// Space Complexity : O(N) for recursive stack space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root == null)
            return ;
        
        if(root.left != null) {
            flatten(root.left);
            TreeNode temp=root.right;
            root.right=root.left;
            root.left=null;
            TreeNode curr=root.right;
            while(curr.right != null)
                curr=curr.right;
            curr.right=temp;
        }
        
        flatten(root.right);
    }
}

