// Question => https://leetcode.com/problems/diameter-of-binary-tree/
class Solution {
    int ans = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
      recursion(root);
        return ans;
    }
    public int recursion(TreeNode root){
          if(root == null){
            return 0;
        }
        int left = recursion(root.left);
        int right = recursion(root.right);
        ans = Math.max(ans,left + right);
        return 1 + Math.max(left,right);
        
    }
}
