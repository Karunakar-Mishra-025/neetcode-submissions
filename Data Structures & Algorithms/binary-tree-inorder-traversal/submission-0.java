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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        helper(root, ls);
        return ls;
    }
    public void helper(TreeNode node, List<Integer> ls) {
        if (node == null) {
            return;
        }

        helper(node.left, ls);   // 1. Left
        ls.add(node.val);        // 2. Root
        helper(node.right, ls);  // 3. Right
    }
}