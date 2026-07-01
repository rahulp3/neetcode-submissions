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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        List<TreeNode> result = new ArrayList<>();
        isPresent(root, subRoot, result);

        if(result.size() == 0){
            return false;
        }

        for(TreeNode subtree : result){
            if(isSame(subtree, subRoot)){
                return true;
            }
        }

        return false;
    }

    public void isPresent(TreeNode root, TreeNode subRoot, List<TreeNode> result){
        if(root == null){
            return;
        }

        if(root.val == subRoot.val){
            result.add(root);
        }

        isPresent(root.left, subRoot, result);
        isPresent(root.right, subRoot, result);
    }

    public boolean isSame(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }

        if(root == null || subRoot == null){
            return false;
        }

        if(root.val != subRoot.val){
            return false;
        }

        return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
    }


}
