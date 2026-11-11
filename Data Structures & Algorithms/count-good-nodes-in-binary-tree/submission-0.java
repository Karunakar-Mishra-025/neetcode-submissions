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
    public int goodNodes(TreeNode root) {
        return helper(root, root.val);
    }
     public int helper(TreeNode node, int maxValue) {
        if (node == null) {
            return 0;
        }

        int count = 0;

        if (node.val >= maxValue) {
            count = 1;
        }

        maxValue = Math.max(maxValue, node.val);

        count += helper(node.left, maxValue);
        count += helper(node.right, maxValue);

        return count;
    }
}
