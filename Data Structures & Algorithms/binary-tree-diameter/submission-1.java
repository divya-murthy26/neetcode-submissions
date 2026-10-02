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
    public int depth(TreeNode root , int [] d){
        if(root == null){
            return 0;
        }

        int lh = depth(root.left , d);
        int rh = depth(root.right , d);

        d[0] = Math.max(d[0], lh+rh);
        return Math.max(lh , rh)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int [] dia = new int[1];
        depth(root , dia);
        return dia[0];
    }
}
