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
         List<List<Integer>> ans = new ArrayList<>();
         Queue<TreeNode> q = new LinkedList<>();
            List<Integer> res = new ArrayList<>();
            
        if(root == null){
            return ans;
        }
        
         q.offer(root);
         q.offer(null);
         while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                ans.add(res);
                res = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.offer(null);
                }
            }else{
                res.add(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);

                }
                if(curr.right!=null){
                    q.offer(curr.right);
                    
                }
            }
         }
        return ans;
    }
}
