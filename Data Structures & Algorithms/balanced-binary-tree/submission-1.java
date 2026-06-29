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
    public boolean isBalanced(TreeNode root) {
        // If the helper returns -1, it means it's unbalanced.
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        // Base case: An empty tree has a height of 0 and is balanced
        if (root == null) {
            return 0;
        }

        // 1. Check if the left subtree is balanced
        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1; // Propagate the "unbalanced" signal up

        // 2. Check if the right subtree is balanced
        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1; // Propagate the "unbalanced" signal up

        // 3. Check if the CURRENT node is balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Current node is unbalanced, send -1 up
        }

        // If everything is fine, return the actual height of this node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
